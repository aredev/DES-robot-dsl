package rasman.robot.mars.des.generator

class DefaultBehaviorGenerator {
	
	def static createFile(String file){
		val onBackUltra = '''
		package behaviors;
		
		import lejos.robotics.subsumption.Behavior;
		import main.MasterRobot;
		
		public class OnBackUltraBehavior implements Behavior{
			
			/**
			 * If the ultra sonic back sensor has a value greater than this threshold,
			 * we have to drive forward. Otherwise, we will fall of the egde.
			 */
			float backUltraSafeThreshold = 0.05f;
			/**
			 * The master robot
			 */
			private MasterRobot masterRobot;
			/**
			 * Indicates if the behavior got suppressed
			 */
			private boolean suppressed = false;
			
			public OnBackUltraBehavior(MasterRobot r) {
				this.masterRobot = r;
			}
		
			@Override
			public boolean takeControl() {
				float backUltraSample = masterRobot.getBackUltraSensorSample();
				return backUltraSample > backUltraSafeThreshold;
			}
		
			@Override
			public void action() {
				System.out.println("Back");
				// set suppressed to false
				suppressed = false;
				// Drive forward
				masterRobot.getRightMotor().rotate(180, true);
				masterRobot.getLeftMotor().rotate(180, true);
				
				while (masterRobot.getLeftMotor().isMoving() && !suppressed){
					// Wait till turn is complete or suppressed is called
					Thread.yield();
				}
				// Clean up
				masterRobot.stopLeftMotor();
				masterRobot.stopRightMotor();
			}
		
			@Override
			public void suppress() {
				suppressed = true;
			}
		
		}
		'''
		
		val onDrive = '''
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
		'''
		
		val onLight = '''
		package behaviors;
		
		import lejos.robotics.subsumption.Behavior;
		import main.MasterRobot;
		import helpers.IgnoreBehaviors;
		
		public class OnLightBehavior implements Behavior {
		
			/**
			 * The master robot
			 */
			private MasterRobot masterRobot;
		
			/**
			 * Indicates if the robot is suppressed
			 */
			private boolean suppressed = false;
		
			/**
			 * The most recent color measurement
			 */
			float whiteBorderValue = 0.545f;
			/**
			 * Indicates if the left light source triggered the onAction()
			 */
			boolean leftIsSource = false;
			/**
			 * Indicates if the right light source triggered the onAction()
			 */
			boolean rightIsSource = false;
		
			public OnLightBehavior(MasterRobot r) {
				this.masterRobot = r;
		
			}
		
			@Override
			public boolean takeControl() {
				float leftLightSensorSample = masterRobot.getLeftLightSensorSample();
				float rightLightSensorSample = masterRobot.getRightLightSensorSample();
				if (leftLightSensorSample >= whiteBorderValue){
					leftIsSource = true;
					return true;
				}
				else if (rightLightSensorSample >= whiteBorderValue){
					rightIsSource = true;
					return true;
				}
				else{
					return false;
				}
			}
		
			/**
			 * We send the colorId of the detected color to the slave and add it to our
			 * own list. If we have found all colors we send that we are done and stop
			 * driving.
			 */
			@Override
			public void action() {
				System.out.println("Light");
				// Reset suppressed
				suppressed = false;
				// Drive backwards
				masterRobot.getRightMotor().rotate(-180, true);
				masterRobot.getLeftMotor().rotate(-180, true);
				// Wait for the motor to stop spinning
				while (masterRobot.getLeftMotor().isMoving() && !suppressed){
					// Wait till turn is complete or suppressed is called
					Thread.yield();
				}
				// Determine if to rotate left or right
				if (leftIsSource){
					// Turn right
					masterRobot.getRightMotor().rotate(-180, true);
					masterRobot.getLeftMotor().rotate(180, true);
				}else{
					// Turn left
					masterRobot.getRightMotor().rotate(180, true);
					masterRobot.getLeftMotor().rotate(-180, true);
				}
				while (masterRobot.getLeftMotor().isMoving() && !suppressed){
					// Wait till turn is complete or suppressed is called
					Thread.yield();
				}
				// Clean up
				masterRobot.getLeftMotor().stop();
				masterRobot.getRightMotor().stop();
			}
		
			@Override
			public void suppress() {
				suppressed = true;
			}
			
		}
		'''
		
		val OnDistance = '''
		package behaviors;
		
		import java.util.Random;
		
		import lejos.robotics.subsumption.Behavior;
		import main.MasterRobot;
		import helpers.IgnoreBehaviors;
		
		public class OnDistanceBehavior implements Behavior{
		  
		  /**
		   * If the ultra sonic back sensor has a value greater than this threshold,
		   * we have to drive forward. Otherwise, we will fall of the egde.
		   */
		  float frontUltraSafeThreshold = 0.2f;
		  /**
		   * The master robot
		   */
		  private MasterRobot masterRobot;
		  /**
		   * Indicates if the behavior got suppressed
		   */
		  private boolean suppressed = false;
		  
		  Random random;
		  
		  public OnDistanceBehavior(MasterRobot r) {
		    this.masterRobot = r;
		    random = new Random();
		  }
		
		  @Override
		  public boolean takeControl() {
		    float frontUltraSample = masterRobot.getFrontUltraSensorSample();
		    return (frontUltraSample > 0 && frontUltraSample <= frontUltraSafeThreshold) && IgnoreBehaviors.withOnDistanceBehavior;
		  }
		
		  @Override
		  public void action() {
		    // set suppressed to false
		    suppressed = false;
		    // Get a random value
		    int rnd = random.nextInt(2);
		    
		    // Rotate based on the random number
		    switch(rnd){
		    case 1:
		      masterRobot.getRightMotor().rotate(-180, true);
		      masterRobot.getLeftMotor().rotate(180, true);
		      break;
		    default:
		      // 0
		      masterRobot.getRightMotor().rotate(180, true);
		      masterRobot.getLeftMotor().rotate(-180, true);
		    }
		        
		    while (masterRobot.getLeftMotor().isMoving() && !suppressed){
		      // Wait for 
		      Thread.yield();
		    }
		    // Clean up
		    masterRobot.stopLeftMotor();
		    masterRobot.stopRightMotor();
		  }
		
		  @Override
		  public void suppress() {
		    suppressed = true;
		  }
		
		}
		'''
		
		val OnGrayTurn = '''
		package behaviors;
		
		import java.util.LinkedList;
		
		import helpers.RGBColorWrapper;
		import lejos.robotics.Color;
		import lejos.robotics.subsumption.Behavior;
		import main.MasterRobot;
		import java.util.Random;
		
		
		/*
		 * In this behavior we we first connect to the slave or wait for the connection from the master (depending on whether we are the master or the slave)
		 * We take control if the measured color is either blue, yellow more red and if we have not encountered this color before. 
		 */
		public class OnGrayTurnBehavior implements Behavior {
		
		  /**
		   * The master robot
		   */
		  private MasterRobot masterRobot;
		
		  /**
		   * Indicates if the robot is suppressed
		   */
		  private boolean suppressed = false;
		
		  /**
		   * The most recent color measurement
		   */
		  float[] mostRecentMeasurement = new float[3];
		  /**
		   * The most recent color ID based on the most recent measurement
		   */
		  int mostRecentColorID = -1;
		
		  /**
		   * Colors found so far
		   */
		  LinkedList<Integer> foundColors = new LinkedList<Integer>();
		  
		  private Random random;
		
		  public OnGrayTurnBehavior(MasterRobot r) {
		    this.masterRobot = r;
		    this.random = new Random();
		
		  }
		
		  @Override
		  public boolean takeControl() {
		    mostRecentMeasurement = masterRobot.getColorSensorSample();
		    mostRecentColorID = RGBColorWrapper.determineColor(mostRecentMeasurement);
		    return mostRecentColorID == Color.GRAY;
		  }
		
		  /**
		   * We send the colorId of the detected color to the slave and add it to our
		   * own list. If we have found all colors we send that we are done and stop
		   * driving.
		   */
		  @Override
		  public void action() {
		    // Reset suppressed
		    suppressed = false;
			if(random.nextBoolean()){
				masterRobot.getLeftMotor().rotate(-180, true);
			    masterRobot.getRightMotor().rotate(180, true);
			}else{
				masterRobot.getLeftMotor().rotate(180, true);
			    masterRobot.getRightMotor().rotate(-180, true);
			}
		    
		    while(masterRobot.getLeftMotor().isMoving() && !suppressed){
		      Thread.yield();
		    }
		    
		    // Clean up
		    masterRobot.stopLeftMotor();
		    masterRobot.stopRightMotor();
		  }
		
		  @Override
		  public void suppress() {
		    suppressed = true;
		  }
		  
		}
		'''
		
		switch(file){
			case "OnBackUltraBehavior.java":
				return onBackUltra
			case "OnDriveBehavior.java":
				return onDrive
			case "OnLightBehavior.java":
				return onLight
			case "OnDistanceBehavior.java":
				return OnDistance
			case "OnGrayTurnBehavior.java":
				return OnGrayTurn
		}
	}
	
}
