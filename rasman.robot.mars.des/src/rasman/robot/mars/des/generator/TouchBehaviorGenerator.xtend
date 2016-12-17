package rasman.robot.mars.des.generator

import rasman.robot.mars.des.dsl.Task
import rasman.robot.mars.des.dsl.TouchSensor
import rasman.robot.mars.des.dsl.TouchSensorSides

class TouchBehaviorGenerator {
	
	def static toBehaviorFile(Task touchTask) 	
	'''
	
	package behaviors;
	
	import lejos.robotics.subsumption.Behavior;
	import main.MasterRobot;
	import main.SlaveRobot;
	import bluetooth.SlaveSensorData;
	import lejos.hardware.Sound;
	import helpers.*;
	import lejos.robotics.Color;
	import java.util.Timer;
		
	
	public class «touchTask.name»Behavior implements Behavior{
	
		private MasterRobot robot;
		private boolean suppressed = false;
		private boolean collisionLeft = false;
		private boolean collisionRight = false;
		private boolean collisionBoth = false;
		private int id;
		
		/**
		*	Boolean to indicate whether times should be set
		*/
		«IF touchTask.timeunit == null»
		private boolean setTimer = false;
		«ELSE»
		private boolean setTimer = true;
		«ENDIF» 
		
		/**
		*	Indicates number of times the action has been performed.
		*/
		private int actionCounter = 0;
		
		/**
		*	Max number of times an action is allowed to run.
		*/
		private int maxNrTime = «touchTask.nrOfTimes»;
		
		public «touchTask.name»Behavior (MasterRobot r, int id) {
			this.robot = r;
			this.id = id;
		}
		
		@Override
		public boolean takeControl() {
			
			if (IgnoreBehaviors.currentTaskId != id){
				return false;
			}
			
			if (setTimer){
				«TimeOutGenerator.toJava(touchTask)»
				setTimer = false;	
			}
			
			if (actionCounter >= maxNrTime){
				IgnoreBehaviors.withOnDistanceBehavior = true;
				IgnoreBehaviors.currentTaskId++;
				Sound.twoBeeps();
				return false;
			}
			
			«IF touchTask.ignoreBehavior != null»
				IgnoreBehaviors.withOnDistanceBehavior = false;
			«ENDIF»
				
			«  createTakeControl(touchTask.sensor as TouchSensor)   »
		}
	
		@Override
		public void action() {
			// Set suppressed to false
			suppressed = false;
			
			«FOR act : touchTask.action»
				«ActionGenerator.generateCodeFromAction(act)»
			«ENDFOR»
			
			«ActionGenerator.yieldingThread(touchTask.action)»
			
			actionCounter++;
		}
			
	
		@Override
		public void suppress() {
			suppressed = true; 
		}
	
	}
	'''	
	
	def static createTakeControl(TouchSensor sensor){
		switch(sensor.key){
			case (TouchSensorSides.LEFT):
				return '''
				if(SlaveSensorData.touchLeft == 1.0){
					collisionLeft = true;
					return true;
				}
				return false;
				'''
			case (TouchSensorSides.RIGHT):
				return '''
				if(SlaveSensorData.touchRight == 1.0){
					collisionRight = true;
					return true;
				}
				return false;
				'''
			case (TouchSensorSides.ANY):
				return '''
				if(SlaveSensorData.touchLeft == 1.0){
					collisionLeft = true;
					return true;
				}else if(SlaveSensorData.touchRight == 1.0){
					collisionRight = true;
					return true;
				}
				return false;
				'''
			case (TouchSensorSides.BOTH):
				return '''
				if(SlaveSensorData.touchLeft == 1.0 && SlaveSensorData.touchRight == 1.0){
					collisionBoth = true;
					return true;
				}
				return false;
				'''
		}
	}
	
}
