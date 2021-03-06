package thread.method;
/**
 * Join线程控制
 * 1. 什么是线程Join
 * 		Thread提供了：让一个线程等待另一个线程完成的方法join()方法
 * 2. 调用join会发生阻塞吗
 * 		当在某个程序执行流中调用其他线程的join()方法时，调用线程将被阻塞，
 *      直到被join()方法加入的join线程执行完为止。
 * 3. Join的应用
 * 		join()方法通常由使用线程的程序调用，以将大问题划分成许多小问题，
 *      每个小问题分配一个线程。当所有的小问题都得到处理后，
 *      再调用主线程来进一步操作。
 * @author sunddenly
 *
 */
public class TestThreadJoin {
	public static void main(String[] args) {
		final Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("线程-1-在执行......  "+i);
				}
				System.out.println("线程-1-执行完毕\n");
			}
		};
		final Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("线程-2-在执行......  "+i);
					if(i==50){
						System.out.println("线程-2-等待====线程1.....");
						try {
							t1.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("线程-2-执行完毕\n");
			}
		};
		Thread t3 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("线程-3-在执行......  "+i);
					if(i==50){
						System.out.println("线程-3-等待====线程2.....");
						try {
							t2.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("线程-3-执行完毕！\n");
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
}
