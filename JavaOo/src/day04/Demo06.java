package day04;

import java.util.Timer;
import java.util.TimerTask;

public class Demo06 {
	public static void main(String[] args) {
		final Timer timer = new Timer();
		//使用匿名内部类实现TimeTask
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("HI");
			}
		};
		timer.schedule(task, 0,1000);
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				timer.cancel();
			}
		}, 1000*10);
	}
	
}
