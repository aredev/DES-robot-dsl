package rasman.robot.mars.des.generator

import rasman.robot.mars.des.dsl.Task
import rasman.robot.mars.des.dsl.UltrasonicSensor

class OnFrontUltraBehaviorGenerator {
	def static toBehaviorFile(Task t)'''
	package behaviors;
	
	import lejos.robotics.subsumption.Behavior;
	import main.MasterRobot;
	import helpers.*;
	import lejos.hardware.Sound;
	import java.util.Timer;
	
	public class OnFrontUltraBehavior implements Behavior{
		
		/**
		 * If the ultra sonic back sensor has a value greater than this threshold,
		 * we have to drive forward. Otherwise, we will fall of the egde.
		 */
		float frontUltraSafeThreshold = 0.3f;
		/**
		 * The master robot
		 */
		private MasterRobot masterRobot;
		/**
		 * Indicates if the behavior got suppressed
		 */
		private boolean suppressed = false;
		
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
		
		private int id;
		
		public OnFrontUltraBehavior(MasterRobot r, int id) {
			this.masterRobot = r;
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
			
			float frontUltraSample = masterRobot.getFrontUltraSensorSample();
			
			if (actionCounter >= maxNrTime){
				IgnoreBehaviors.withOnDistanceBehavior = true;
				IgnoreBehaviors.currentTaskId++;
				Sound.twoBeeps();
				return false;
			}
			
			«IF t.ignoreBehavior != null»
				IgnoreBehaviors.withOnDistanceBehavior = false;
			«ENDIF»
			
			return frontUltraSample «(t.sensor as UltrasonicSensor).comparator»  «(t.sensor as UltrasonicSensor).distance»;
		}
	
		@Override
		public void action() {
			// set suppressed to false
			suppressed = false;
			
			«FOR act : t.action»
				«ActionGenerator.generateCodeFromAction(act)»
			«ENDFOR»
			
			«ActionGenerator.yieldingThread(t.action)»
			
			
			actionCounter++;
			
		}
	
		@Override
		public void suppress() {
			suppressed = true;
		}
	
	}
	'''
}