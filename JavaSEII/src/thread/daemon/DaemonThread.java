package thread.daemon;
/**
 * 后台线程守护线程
 * 特点：
 * 		当前进程中的所有前台线程都死亡后，后台线程强制死亡
 *      无论是否还在运行
 * @author sunddenly
 * 注意：
 * 而且要将某个线程设置为后台线程，必须在该线程启动之前设置，
 * 也就是说setDaemon(true)必须在start()方法之前调用，
 * 否则会引发IllegaIThreadStateException异常
 *
 */
public class DaemonThread {
	public static void main(String[] args) {
		Thread daemon = new Thread("daemon"){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println(getName()+" "+i);
				}
			}
		};
		daemon.setDaemon(true);
		daemon.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println("main线程结束！");
	}
}
