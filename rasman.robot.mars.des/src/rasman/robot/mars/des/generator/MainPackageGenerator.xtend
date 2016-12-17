package rasman.robot.mars.des.generator

class MainPackageGenerator {
	
	def static createFile(String file){
		val direction = '''
		package main;
		
		public enum Direction {
			LEFT, RIGHT
		}
		'''
		
		val MasterRobot = '''
		package main;
			
		import lejos.hardware.ev3.LocalEV3;
		import lejos.hardware.motor.EV3LargeRegulatedMotor;
		import lejos.hardware.port.MotorPort;
		import lejos.hardware.sensor.EV3ColorSensor;
		import lejos.hardware.sensor.EV3UltrasonicSensor;
		import lejos.hardware.sensor.NXTLightSensor;
		import lejos.robotics.SampleProvider;
		import bluetooth.SlaveSensorData;
		
		public class MasterRobot extends Robot{
		
			private final EV3LargeRegulatedMotor leftMotor, rightMotor, armMotor;
			
			private final NXTLightSensor leftLightSensor, rightLightSensor;
			
			private final EV3UltrasonicSensor backUltraSensor;
			
			private final EV3ColorSensor colorSensor;
			
			private final SampleProvider leftLight, rightLight, backDistance, color;
			
			public MasterRobot() {
				leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
				rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);
				armMotor = new EV3LargeRegulatedMotor(MotorPort.C);
				
				leftLightSensor = new NXTLightSensor(LocalEV3.get().getPort("S1"));
				rightLightSensor = new NXTLightSensor(LocalEV3.get().getPort("S2"));
				
				backUltraSensor = new EV3UltrasonicSensor(LocalEV3.get().getPort("S3"));
				
				colorSensor = new EV3ColorSensor(LocalEV3.get().getPort("S4"));
				
				//Sample Providers
				leftLight = leftLightSensor.getRedMode();
				rightLight = rightLightSensor.getRedMode();
				color = colorSensor.getRGBMode();
				backDistance = backUltraSensor.getDistanceMode();
		
			}
			
			public void rotateLeftMotorBackward(){
				this.leftMotor.backward();
			}
			
			public void rotateLeftMotorForward(){
				this.leftMotor.forward();
			}
			
			public void rotateRightMotorBackward(){
				this.rightMotor.backward();
			}
			
			public EV3LargeRegulatedMotor getArmMotor(){
				return this.armMotor;
			}
			
			public void putArmMotorDown(){
				armMotor.rotate(-120);
			}
			  
			public void putArmMotorUp(){
				armMotor.rotate(120);
			}
			
			public float getFrontUltraSensorSample(){
				return SlaveSensorData.frontUltra;
			}
			
			
			public void rotateRightMotorForward(){
				this.rightMotor.forward();
			}
			
			public void stopRightMotor(){
				this.rightMotor.stop(true);
			}
			
			public void stopLeftMotor(){
				this.leftMotor.stop(true);
			}
			
			public EV3LargeRegulatedMotor getLeftMotor(){
				return this.leftMotor;
			}
			
			public EV3LargeRegulatedMotor getRightMotor(){
				return this.rightMotor;
			}
			
			/**
			 * Returns the color ID of the surface.
			 * The sensor can identify 8 unique colors (NONE, BLACK, BLUE, GREEN, YELLOW, RED, WHITE, BROWN)
			 * with ID of 0-7 respectively.
			 * @return The color ID of the surface.
			 */
			public float[] getColorSensorSample(){
				/**
				 * colorsensor.sampleSize() has the value 1
				 * If you want to use RGB measurements, you should change it to 3.
				 */
				float [] sampleSize = new float [3];
				color.fetchSample(sampleSize, 0);
				return sampleSize;
			}
			
			/**
			 * Get the sample of the left light sensor
			 * @return
			 */
			public float getLeftLightSensorSample(){
				float [] sampleSize = new float [1];
				leftLight.fetchSample(sampleSize, 0);
				return sampleSize[0];
			}
			
			/**
			 * Get the sample of the right light sensor
			 * @return
			 */
			public float getRightLightSensorSample(){
				float [] sampleSize = new float [1];
				rightLight.fetchSample(sampleSize, 0);
				return sampleSize[0];
			}
				
			/**
			 * Get the value of the ultrasonic sensor on the back.
			 * Note that this sensor points down, so it can be used to prevent from falling off
			 * the platform when driving backwards.
			 * @return float value of the current sample of the ultrasonic sensor.
			 */
			public float getBackUltraSensorSample(){
				float[] sampleSize = new float[backUltraSensor.sampleSize()];
				backDistance.fetchSample(sampleSize, 0);
				return sampleSize[0];
			}	
		}
		
		'''
		
		val RASMAN2 = '''
		package main;
		
		public class RASMAN2 {
		
			public static void main(String[] args) {
				Robot robot = new Robot();
				robot.init();
			}
		
		}
		'''
		
		val SlaveRobot = '''
		package main;
		
		import lejos.hardware.ev3.LocalEV3;
		import lejos.hardware.sensor.EV3GyroSensor;
		import lejos.hardware.sensor.EV3TouchSensor;
		import lejos.hardware.sensor.EV3UltrasonicSensor;
		import lejos.robotics.SampleProvider;
		
		public class SlaveRobot extends Robot {
		
			/**
			 * The left touch sensor
			 */
			private EV3TouchSensor touchLeftSensor;
			/**
			 * The right touch sensor
			 */
			private EV3TouchSensor touchRightSensor;
			/**
			 * The front ultra sensor
			 */
			private EV3UltrasonicSensor frontUltraSensor;
			/**
			 * The gyro sensor
			 */
			private EV3GyroSensor gyroSensor;
			/**
			 * The sample providers for the sensors
			 */
			private SampleProvider touchLeft, touchRight, ultraBack, gyro;
		
			public SlaveRobot() {
				touchLeftSensor = new EV3TouchSensor(LocalEV3.get().getPort("S1"));
				touchRightSensor = new EV3TouchSensor(LocalEV3.get().getPort("S2"));
		
				frontUltraSensor = new EV3UltrasonicSensor(LocalEV3.get().getPort("S3"));
		
				gyroSensor = new EV3GyroSensor(LocalEV3.get().getPort("S4"));
				
				//Sample providers
				touchLeft = touchLeftSensor.getTouchMode();
				touchRight = touchRightSensor.getTouchMode();
				ultraBack = frontUltraSensor.getDistanceMode();
				gyro = gyroSensor.getAngleMode();
			}
		
			/**
			 * Get the touch value of the touch sensor for a given direction
			 * @param dir	Specifies from which touch sensor you need obtain the sample
			 * @return		The touch sample of the touch sensor for the specified dir.
			 */
			public int getTouchValue(Direction dir) {
				switch (dir) {
					case LEFT: {
						float[] sampleSize = new float[touchLeftSensor.sampleSize()];
						touchLeft.fetchSample(sampleSize, 0);
						return (int) sampleSize[0];
					}
					default: {
						// RIGHT
						float[] sampleSize = new float[touchRightSensor.sampleSize()];
						touchRight.fetchSample(sampleSize, 0);
						return (int) sampleSize[0];
					}
				}
			}
			
			/**
			 * Get the current gyro value modulo 360
			 * @return The gyro value mod 360
			 */
			public int getGyroValue(){
				float[] sampleSize = new float[gyroSensor.sampleSize()];
				gyro.fetchSample(sampleSize, 0);
				//FIXME: currently working modulo 360, but this should not be the default behavior.
				return (int) (sampleSize[0] % 360);
			}
			
			/**
			 * Get the value of the ultrasonic sensor on the back.
			 * @return float of the current sample of the ultrasonic sensor on the back.
			 */
			public float getFrontUltraValue(){
				float[] sampleSize = new float[frontUltraSensor.sampleSize()];
				ultraBack.fetchSample(sampleSize, 0);
				return sampleSize[0];
			}
		
		}
		'''
		
		switch(file){
			case "Direction.java":
				return direction
			case "MasterRobot.java":
				return MasterRobot
			case "RASMAN2.java":
				return RASMAN2
			case "SlaveRobot.java":
				return SlaveRobot
		}
	}
	
}
