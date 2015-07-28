package thread.runnable;

import thread.thread.MyFirstThread;

public class TestRunnbale {
	public static void main(String[] args) {
		Runnable r1 =new MyfirstRunnable();
		Runnable r2 = new MySecondRunnable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//t1.start();
		//t2.start();
		/**
		 * 匿名内部类用一下就完了
		 */
		Thread t3 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("忘了");
			}
			
		});
		t3.start();
	}
}
