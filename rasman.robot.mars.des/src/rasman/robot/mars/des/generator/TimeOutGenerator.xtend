package rasman.robot.mars.des.generator

import rasman.robot.mars.des.dsl.Task
import rasman.robot.mars.des.dsl.timeUnit
import java.util.Timer

class TimeOutGenerator {
	def static toJava(Task t){
		var timerCode = ''''''
		if (t.timeunit != null){
			timerCode += '''Timer timeOutTask = new Timer();
			'''
			//There is an ExpiresAfter specified
			if(t.timeunit.unit == timeUnit.SECONDS){
				timerCode += '''timeOutTask.schedule(new IncrementIdOnTimeOutTask(), «t.time*1000»);
				'''
			}else{
				timerCode += '''timeOutTask.schedule(new IncrementIdOnTimeOutTask(), «t.time»);
				'''
			}
		}
		
		return timerCode;
	}
}