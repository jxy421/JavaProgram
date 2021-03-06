package thread.method;
/**
 * 线程的方法
 * @author sunddenly
 *	static void yield()
 *      当前线程让出处理器（离开Running状态）即放弃当前时间片，
 *      主动进入Runnable状态等待。
 *  final void setPriority(int)：
 *  	设置线程优先级；优先级越高的线程，理论上获取cpu的次数就越多。
 *      但理想与现实是有差距的……设置线程优先级一定要在线程启动前设置！
 *  final void join()：
 *  	等待该线程终止
 */
public class TestThreadYeild {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("我是"+"线程---1");
					Thread.yield();
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("我是"+"线程---2");
					Thread.yield();
				}
			}
		};
		Thread t3 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("我是"+"线程--2");
					Thread.yield();
				}
			}
		};
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
