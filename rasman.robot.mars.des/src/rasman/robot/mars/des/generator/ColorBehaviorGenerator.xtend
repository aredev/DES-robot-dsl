package rasman.robot.mars.des.generator

import rasman.robot.mars.des.dsl.ColorSensor
import rasman.robot.mars.des.dsl.Task

class ColorBehaviorGenerator {
	
	def static toBehaviorFile(Task t)'''
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
	public class «t.name»Behavior implements Behavior{
	
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
		private int maxNrTime = «t.nrOfTimes»;
		
		/**
		*	Boolean to indicate whether times should be set
		*/
		«IF t.timeunit == null»
		private boolean setTimer = false;
		«ELSE»
		private boolean setTimer = true;
		«ENDIF» 
		
		public «t.name»Behavior(MasterRobot r, int id) {
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
				«TimeOutGenerator.toJava(t)»
				setTimer = false;	
			}
			
			«IF t.nrOfTimes > 0»
			if (actionCounter >= maxNrTime){
				IgnoreBehaviors.withOnDistanceBehavior = true;
				IgnoreBehaviors.currentTaskId++;
				Sound.twoBeeps();
				return false;
			}
			«ENDIF»
						
			«IF t.ignoreBehavior != null»
				IgnoreBehaviors.withOnDistanceBehavior = false;
			«ENDIF»
			
			«defineTakeControl(t.sensor as ColorSensor)»
		}
	
		@Override
		/**
		 * We send the colorId of the detected color to the slave and add it to our own list. 
		 * If we have found all colors we send that we are done and stop driving. 
		 */
		public void action() {
			
			suppressed = false;
			
			«IF (t.sensor as ColorSensor).distinct»
				if ( ! foundColors.contains(currentColor)){
					//The color has not been found before
					foundColors.add(currentColor);
					«FOR act : t.action»
						«ActionGenerator.generateCodeFromAction(act)»
					«ENDFOR»
				}
			«ELSE»	
			
			«FOR act : t.action»
				«ActionGenerator.generateCodeFromAction(act)»
			«ENDFOR»	
			«ENDIF»	
			
			«ActionGenerator.yieldingThread(t.action)»
			
			actionCounter++;
			
		}
	
		@Override
		public void suppress() {
			suppressed = true;	
		}
	}
	'''
	
	def static defineTakeControl(ColorSensor sensor){
		val storeColor = '''currentColor = RGBColorWrapper.determineColor(robot.getColorSensorSample());
		'''
		
		if ( sensor.keys.size() > 0  ){
			return 
			storeColor + 
			'''
			ArrayList<Integer> toFindColors = new ArrayList<Integer>();
			«FOR color : sensor.keys»
			toFindColors.add(Color.«color.color»);
			«ENDFOR»
			
			«IF sensor.distinct»
				return (! foundColors.contains(currentColor) && toFindColors.contains(currentColor));
			«ELSE»
				return toFindColors.contains(currentColor);
			«ENDIF»
			'''
		}else if( sensor.key != null ) {
			if (sensor.distinct){
				return storeColor + 
				'''
				return ( currentColor == Color.«sensor.key.color» && !foundColors.contains(currentColor));
				'''
			}else{
				return storeColor + 
				'''
				return currentColor == Color.«sensor.key.color»;'''	
			}
		}
	}
	
}
