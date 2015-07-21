package day04;

import java.util.Timer;
import java.util.TimerTask;

public class Demo05 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTask(),0,1000);
	}
}
class MyTask extends TimerTask{
	char[] chs={'-','\\','|','/'};
	int i=0;
	public void run(){
		System.out.println(chs[i++%chs.length]);
	}
}