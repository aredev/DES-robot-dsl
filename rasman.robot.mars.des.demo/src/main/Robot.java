package main;
		
import behaviors.*;
import bluetooth.BluetoothConnector;
import bluetooth.BluetoothConnectorContainer;
import bluetooth.SlaveSensorData;
import bluetooth.BluetoothSensorDataStreamer;
import lejos.hardware.BrickFinder;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
import lejos.hardware.Sound;
import helpers.*;

/**
 * @author Abdullah Rasool, Tom Sandmann
 *
 */

public class Robot {

	/**
	 * Indicates whether this is the master robot
	 */
	private boolean isMasterRobot;
	/**
	 * The name of the master robot
	 */
	private String masterRobotName;
	
	/**
	 * The master robot
	 */
	private MasterRobot masterRobot = null;
	/**
	 * The slave robot
	 */
	private SlaveRobot slaveRobot = null;
	/**
	 * Constructor
	 */
	public Robot(){
		determineRobot();
	}
	
	/**
	 * Init 
	 */
	public void init(){
		if(isMasterRobot)
			startMasterRobot();
		else
			startSlaveRobot();
		Run();
	}
	
	private void startMasterRobot(){
		masterRobot = new MasterRobot();
	}
	
	private void startSlaveRobot(){
		slaveRobot = new SlaveRobot();
	}
	
	/**
	 * Determine which robot you are and who will setup the bluetooth connector
	 */
	private void determineRobot(){
		// Set the name of the master robot
		isMasterRobot = false;
		// Check whether this is a master robot
		if(BrickFinder.getLocal().getName().equals("Rover5")){
			isMasterRobot = true;
		}
		else if(BrickFinder.getLocal().getName().equals("Rover7")){
			isMasterRobot = true;
		}
		//The slave needs to know his name, so he can connect to the master
		//The slave starts the connection, because he immediately starts to stream sensor data to the master
		masterRobotName = BrickFinder.getLocal().getName();
	}
	
	/**
	 * Run method of the robot
	 */
	public void Run(){
		BluetoothConnectorContainer container = new BluetoothConnectorContainer(isMasterRobot, masterRobotName);
		if (isMasterRobot){
			// This is the master robot
			System.out.print("I'm the master");
			int idCounter = 0;
			container.getInstance().checkForMessage();
			// Start the thread for receiving the sensor values
			// Define the list of behaviors
			Behavior[] behaviors = { 
						new OnDriveBehavior(masterRobot),
						new PushFromTableBehavior(masterRobot, idCounter++),
						new FindThreeColorsBehavior(masterRobot, idCounter++),
						new DetectRocksAndMeasureBehavior(masterRobot, idCounter++),
						new OnDistanceBehavior(masterRobot),
						new OnGrayTurnBehavior(masterRobot),
						new OnBackUltraBehavior(masterRobot),
						new OnLightBehavior(masterRobot) 
					};
			// Create and start the arbitrator
			Arbitrator arbitrator = new Arbitrator(behaviors);
			
			IgnoreBehaviors.totalNrOfTasks = behaviors.length;
			
			new Thread(new Runnable(){
				@Override
				public void run() {
					while(true){
						if (3 == IgnoreBehaviors.currentTaskId){
							Sound.twoBeeps();
							Sound.twoBeeps();
							System.exit(1);
						}
					}
				}
			}).start();	
			
			arbitrator.go();
		}
		else{
			// This is the slave robot
			System.out.print("I'm the slave");
			// Only define one behavior that will stream the sensor values
			Behavior[] behaviors = {
					new BluetoothSensorDataStreamer(slaveRobot, container.getInstance())
					};
			Arbitrator arbitrator = new Arbitrator(behaviors);
			arbitrator.go();
		}
	}
	
}