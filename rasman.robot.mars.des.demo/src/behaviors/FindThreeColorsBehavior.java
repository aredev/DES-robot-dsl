package behaviors;

import bluetooth.BluetoothConnector;
import lejos.robotics.Color;
import lejos.robotics.subsumption.Behavior;
import main.MasterRobot;
import java.util.ArrayList;
import helpers.*;
import lejos.hardware.Sound;
import lejos.robotics.Color;
import java.util.Timer;


/*
 * In this behavior we we first connect to the slave or wait for the connection from the master (depending on whether we are the master or the slave)
 * We take control if the sensored color is either blue, yellow mor red and if we have not encountered this color before. 
 */
public class FindThreeColorsBehavior implements Behavior{

	private MasterRobot robot;
	private float[] rgb;
	private boolean suppressed = false;
	private ArrayList<Integer> foundColors;
	private int currentColor;
	private int id; 
	
	/**
	*	Indicates number of times the action has been performed.
	*/
	private int actionCounter = 0;
	
	/**
	*	Max number of times an action is allowed to run.
	*/
	private int maxNrTime = 3;
	
	/**
	*	Boolean to indicate whether times should be set
	*/
	private boolean setTimer = false;
	
	public FindThreeColorsBehavior(MasterRobot r, int id) {
		this.robot = r;
		foundColors = new ArrayList<Integer>();
		this.id = id;		
	}
	
	@Override
	public boolean takeControl() {			
		if (IgnoreBehaviors.currentTaskId != id){
			return false;
		}
		
		if (setTimer){
			setTimer = false;	
		}
		
		if (actionCounter >= maxNrTime){
			IgnoreBehaviors.withOnDistanceBehavior = true;
			IgnoreBehaviors.currentTaskId++;
			Sound.twoBeeps();
			return false;
		}
					
		
		currentColor = RGBColorWrapper.determineColor(robot.getColorSensorSample());
		ArrayList<Integer> toFindColors = new ArrayList<Integer>();
		toFindColors.add(Color.RED);
		toFindColors.add(Color.GREEN);
		toFindColors.add(Color.BLUE);
		
		return (! foundColors.contains(currentColor) && toFindColors.contains(currentColor));
	}

	@Override
	/**
	 * We send the colorId of the detected color to the slave and add it to our own list. 
	 * If we have found all colors we send that we are done and stop driving. 
	 */
	public void action() {
		
		suppressed = false;
		
		if ( ! foundColors.contains(currentColor)){
			//The color has not been found before
			foundColors.add(currentColor);
			//Action: beep
			
			Sound.buzz();
			
			//End action
			robot.putArmMotorDown();
			robot.putArmMotorUp();
			
			robot.getArmMotor().stop();
		}
		
		
		actionCounter++;
		
	}

	@Override
	public void suppress() {
		suppressed = true;	
	}
}
