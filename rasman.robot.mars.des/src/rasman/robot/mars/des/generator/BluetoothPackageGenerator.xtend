package rasman.robot.mars.des.generator

class BluetoothPackageGenerator {
	
	def static createFile(String fileName) {
		val bluetoothConnectorContent = '''
		package bluetooth;
		
		import java.io.DataInputStream;
		import java.io.IOException;
		import java.io.PrintWriter;
		import java.util.HashMap;
		
		// @see http://stackoverflow.com/questions/8997598/importing-json-into-an-eclipse-project
		
		import lejos.remote.nxt.BTConnector;
		import lejos.remote.nxt.NXTConnection;
		/**
		 * In this class we handle the bluetooth connection
		 * 
		 */
		public class BluetoothConnector {
			
			/**
			 * Hashmap containing the paired robots
			 */
			private final HashMap<String, String> pairedRobots = new HashMap<String, String>();
			/**
			 * The print writer, for writing messages using bluetooth
			 */
			private PrintWriter writer = null;
			
			/**
			 * The timeout value for bluetooth
			 */
			private final int TIMEOUT = 60000;
			/**
			 * The bluetooth connection
			 */
			private final NXTConnection connection;
			/**
			 * The bluetooth message that was received
			 */
			private String message;
			/**
			 * Indicates whether there is a message received that can be read
			 */
			private boolean messageReady;
			
			/**
			 * Master constructor
			 * connect to a specific robot
			 *
			 * @param masterRobotName The name of the master robot.
			 */
			public BluetoothConnector(String masterRobotName){
				initializePairedRobots();
				// Create the bluetooth connector
				BTConnector connector = new BTConnector();
				// Get the corresponding slave robot
				String correspondingSlave = pairedRobots.get(masterRobotName);
				System.out.println("Trying to connect to " + correspondingSlave);
				connection = connector.connect(correspondingSlave, NXTConnection.RAW);
				if(connection == null){
					System.out.println("Could not connect to " + correspondingSlave);
				}else{
					System.out.println("Connection success");
					writer = new PrintWriter(connection.openDataOutputStream());
				}
			}
			
			public BluetoothConnector getBluetoothConnector(){
				return this;
			}
			
			/**
			 * Slave constructor 
			 * Wait for connection from master
			 */
			public BluetoothConnector(){
				BTConnector connector = new BTConnector();
				connection = connector.waitForConnection(TIMEOUT, NXTConnection.RAW);
				writer = new PrintWriter(connection.openOutputStream());
			}
			
			/**
			 * Send a batch of sensor values through bluetooth.
			 * We could make use of JSON structure, but this is not nessacacy. 
			 * Also see http://stackoverflow.com/questions/13340138/how-to-generate-json-string-in-java-using-net-sf-json
			 * if we somehow decided to do so.
			 * @param touchLeft		The value of the touch left sensor
			 * @param touchRight	The value of the touch right sensor
			 * @param frontUltra	The value of the front ultrasonic sensor
			 * @param gyro			The value of the gyro
			 */
			public void writeMessage(int touchLeft, int touchRight, float frontUltra, float gyro){
				// Sending a batch of sensor values to the master. 		
				StringBuilder batch = new StringBuilder();
				// Add all of the data to the current batch
				batch
				.append(touchLeft).append(" ")
				.append(touchRight).append(" ")
				.append(frontUltra).append(" ")
				.append(gyro);
				
				System.out.println(batch.toString());
		
				writer.println(batch.toString());
				// Flush it.
				writer.flush();
			}
			
			
			/**
			 * Thread checks whether a message is received from the other robot.
			 * If that is the case, we set a flag in the ReadMessageBehavior
			 */
			public void checkForMessage(){
				//BufferedReader reader = new BufferedReader(new InputStreamReader(connection.openInputStream()));
				DataInputStream reader = connection.openDataInputStream();
				new Thread(new Runnable(){
					@Override
					public void run() {
						while(true){
							try{
								message = reader.readLine();
								messageReady = (message.length() > 0);
		
								if (messageReady){
									updateValues();
								}
							}catch (IOException ex){
								System.out.println("EXCP\n" + ex.getMessage());
								messageReady = false;
							}
						}
					}
				}).start();
			}
			
			/**
			 * Update sensor values
			 */
			private void updateValues(){
				String [] sensorValues = message.split("\\s+");
				SlaveSensorData.touchLeft = Integer.parseInt(sensorValues[0]);
				SlaveSensorData.touchRight = Integer.parseInt(sensorValues[1]);
				SlaveSensorData.frontUltra = Float.parseFloat(sensorValues[2]);
				SlaveSensorData.gyro = Float.parseFloat(sensorValues[3]);
			}
			
			/**
			 * @return received message
			 */
			public String getMessage(){
				messageReady = false;
				return message;
			}
			
			/**
			 * 
			 * @return <code>True</code> if there is a message available, <code>False</code> otherwise
			 */
			public boolean messageAvailable(){
				return messageReady;
			}
			
			/**
			 * Initialize the pairs of robots that have been coupled
			 */
			private void initializePairedRobots(){
				pairedRobots.put("Rover5", "Rover6");
				pairedRobots.put("Rover6", "Rover5");
				pairedRobots.put("Rover7", "Rover8");
				pairedRobots.put("Rover8", "Rover7");
			}
			
			
		}
		'''
		
		val BluetoothConnectorContainer = '''
		package bluetooth;
		
		/**
		 * Container for the bluetooth connector
		 * In order to prevent NullPointer
		 */
		
		public class BluetoothConnectorContainer {
		
			private BluetoothConnector controller;
			private boolean isMaster;
			
			/**
			 * Constructor
			 * @param master		Indicates if the robot is the master
			 * @param masterName	The name of the master
			 */
			public BluetoothConnectorContainer(boolean master, String masterName){
				this.isMaster = master;
				if(! isMaster){
					//The slave inits the bluetooth connection
					controller = new BluetoothConnector(masterName);
				}else{
					controller = new BluetoothConnector();
				}
			}
			
			/**
			 * Get the BluetoothConnector instance
			 * @return BluetoothConnector instance
			 */
			public BluetoothConnector getInstance(){
				return controller;
			}
			
		}
		'''
		
		val BluetoothSensorDataStreamer = '''
		package bluetooth;
		
		import lejos.robotics.subsumption.Behavior;
		import main.Direction;
		import main.SlaveRobot;
		
		
		public class BluetoothSensorDataStreamer implements Behavior {
			
			/*
			 * The bluetooth connector
			 */
			BluetoothConnector connector;
			/*
			 * The slave robot
			 */
			private final SlaveRobot slaveRobot;
			/*
			 * Indicates whether the behavior got suppressed
			 */
			boolean suppressed;
			
			/**
			 * Constructor
			 * @param slaveRobot	The slave robot.
			 */
			public BluetoothSensorDataStreamer(SlaveRobot slaveRobot, BluetoothConnector connector){
				this.slaveRobot = slaveRobot;
				this.connector = connector;
				suppressed = false;
			}
		
			/**
			 * Take control method, always return true as this is the only behavior of the slave.
			 */
			@Override
			public boolean takeControl() {
				return true;
			}
		
			/**
			 * The action method, which specified what the slave will do
			 */
			@Override
			public void action() {
				while (!suppressed){
					/*
					 * Time to wait before retransmitting the data
					 */
					long refreshRate = 100;
					/**
					 * Retrieve all of the sensor values and submit them
					 */
					int touchLeft = slaveRobot.getTouchValue(Direction.LEFT);
					int touchRight = slaveRobot.getTouchValue(Direction.RIGHT);
					float frontUltra = slaveRobot.getFrontUltraValue();
					int gyro = slaveRobot.getGyroValue();
					try{
						connector.writeMessage(touchLeft, touchRight, frontUltra, gyro);
					}catch(Exception e){
						System.exit(0);
					}
					/**
					 * Sleep some time before resending the values.
					 */
					try {
						Thread.sleep(refreshRate);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		
			@Override
			public void suppress() {
				suppressed = true;
			}
			
		}
		'''
		
		val SlaveSensorData = '''
		package bluetooth;
		
		public class SlaveSensorData {
			
			// Static variables that can be read to access the latest sensor values available
			public static int touchLeft = -1;
			public static int touchRight = -1;
			public static float frontUltra = -1;
			public static float gyro = -1; 
		}
		
		'''
		
		switch(fileName){
			case "BluetoothConnector.java":
				return bluetoothConnectorContent
			case "BluetoothConnectorContainer.java":
				return BluetoothConnectorContainer
			case "BluetoothSensorDataStreamer.java":
				return BluetoothSensorDataStreamer
			case "SlaveSensorData.java":
			 	return SlaveSensorData
		}	
	}

}
