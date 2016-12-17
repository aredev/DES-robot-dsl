
package behaviors;

import lejos.robotics.subsumption.Behavior;
import main.MasterRobot;
import main.SlaveRobot;
import bluetooth.SlaveSensorData;
import lejos.hardware.Sound;
import helpers.*;
import lejos.robotics.Color;
import java.util.Timer;
	

public class PushFromTableBehavior implements Behavior{

	private MasterRobot robot;
	private boolean suppressed = false;
	private boolean collisionLeft = false;
	private boolean collisionRight = false;
	private boolean collisionBoth = false;
	private int id;
	
	/**
	*	Boolean to indicate whether times should be set
	*/
	private boolean setTimer = false;
	
	/**
	*	Indicates number of times the action has been performed.
	*/
	private int actionCounter = 0;
	
	/**
	*	Max number of times an action is allowed to run.
	*/
	private int maxNrTime = 2;
	
	public PushFromTableBehavior (MasterRobot r, int id) {
		this.robot = r;
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
		
		IgnoreBehaviors.withOnDistanceBehavior = false;
			
		if(SlaveSensorData.touchLeft == 1.0){
			collisionLeft = true;
			return true;
		}else if(SlaveSensorData.touchRight == 1.0){
			collisionRight = true;
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		// Set suppressed to false
		suppressed = false;
		
		robot.getLeftMotor().forward();
		robot.getRightMotor().forward();
		
		
		
		while(!suppressed && RGBColorWrapper.determineColor(robot.getColorSensorSample()) != Color.WHITE  ){
			Thread.yield();
		}
		
		
		actionCounter++;
	}
		

	@Override
	public void suppress() {
		suppressed = true; 
	}

}
