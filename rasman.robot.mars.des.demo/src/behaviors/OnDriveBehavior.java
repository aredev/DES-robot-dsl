package behaviors;

import lejos.robotics.subsumption.Behavior;
import main.MasterRobot;

public class OnDriveBehavior implements Behavior{

	private MasterRobot robot;
	private boolean suppressed = false;
	
	/**
	 * 
	 * @param r	
	 */
	public OnDriveBehavior(MasterRobot r){
		this.robot = r;
	}
	
	@Override
	public boolean takeControl() {
		return true;
	}

	@Override
	public void action() {
		System.out.println("Drive");
		// Set suppressed to false
		suppressed = false;
		robot.getLeftMotor().setSpeed(150);
		robot.getRightMotor().setSpeed(150);
		// Make both motors go forward
		robot.getLeftMotor().forward();
		robot.getRightMotor().forward();
	
		while(!suppressed){
			// Wait till turn is complete or suppressed is called
			Thread.yield();
		}
		// Clean up
		robot.stopLeftMotor();
		robot.stopRightMotor();
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
}
