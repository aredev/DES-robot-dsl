package rasman.robot.mars.des.generator

import java.util.List
import rasman.robot.mars.des.dsl.Actions

class ActionGenerator {
	
	def static generateCodeFromAction(Actions act){
		switch(act){
			case Actions.BEEP:
				return '''
				//Action: beep
				
				Sound.buzz();
				
				//End action'''
			case Actions.DRIVE_BACKWARD:
				return '''
					//Action: drive backward 
					robot.getRightMotor().rotate(-180,true);
					robot.getLeftMotor().rotate(-180, true);
					
					//End action
					
				  '''
		  	case Actions.DRIVE_FORWARD:
		  		return ''' 
					robot.getRightMotor().rotate(180,true);
					robot.getLeftMotor().rotate(180, true);  
		  			'''
  			case Actions.ROTATE_R:
  				return '''
					robot.getRightMotor().rotate(-180,true);
					robot.getLeftMotor().rotate(180, true);
  				'''
			case Actions.ROTATE_L:
				return '''
					robot.getRightMotor().rotate(180,true);
					robot.getLeftMotor().rotate(-180, true);
				'''
		  	case Actions.STOP_DRIVING:
		  		return '''
		  			robot.getLeftMotor().stop();
		  			robot.getRightMotor().stop();
		  		'''
	  		case Actions.TURN_AROUND:
	  			return '''
					robot.getRightMotor().rotate(360,true);
					robot.getLeftMotor().rotate(-360, true);
	  			'''
  			case Actions.DRIVETOEDGE:
  				return '''
  					robot.getLeftMotor().forward();
  					robot.getRightMotor().forward();
  					
  					
  				'''
  				
			case Actions.MEASURE:
				return '''
				robot.putArmMotorDown();
				robot.putArmMotorUp();
				
				robot.getArmMotor().stop();
				'''
  			}
		}
		
	def static yieldingThread(List<Actions> actions){	
		for(Actions act : actions){
			if(act == Actions.DRIVETOEDGE){
				//Keep on drive until at edge
				return '''
				while(!suppressed && RGBColorWrapper.determineColor(robot.getColorSensorSample()) != Color.WHITE  ){
					Thread.yield();
				}'''
			}else if(act != Actions.BEEP && act != Actions.STOP_DRIVING && act != Actions.MEASURE){
				//Keep the motors spinning
				return '''
				while(!suppressed && robot.getLeftMotor().isMoving()){
					Thread.yield();
				}
				'''
			}
		}		
	}
	
}
