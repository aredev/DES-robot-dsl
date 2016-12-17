package helpers;

import java.util.TimerTask;
import lejos.hardware.Sound;


public class IncrementIdOnTimeOutTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Time is up");
		if (IgnoreBehaviors.currentTaskId+1 <= IgnoreBehaviors.totalNrOfTasks){
			//If there is still that needs to run, let it run
			IgnoreBehaviors.currentTaskId++;
			Sound.twoBeeps();
		}else{
			//Kill the application
			System.exit(0);
		}
	}

}
