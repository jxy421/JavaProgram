package thread.thread;
/**
 *	�߳�
 * @author sunddenly
 *
 */
public class MyFirstThread extends Thread {
	public void run(){
		for(int i=0;i<100000;i++){
			System.out.println(i);
		}
	}
}
