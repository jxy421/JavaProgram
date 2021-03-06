package thread.method;
/**
 * 中断异常演示
 * @author sunddenly
 *
 */
public class TestInterruptedException {
	public static void main(String[] args) {
		/**
		 * 进入睡眠阻塞
		 * 方法中定义的类叫局部内部类：局部内部类中，
		 * 若想引用当前方法的其他局部变量，
		 * 那么该变量必须是final的
		 */
		final Thread t1 =new Thread(){
			public void run(){
				System.out.println("进入睡眠。。。。。");
				try{
					Thread.sleep(1000000);
				} catch(InterruptedException e){
					System.out.println("线程唤醒，t1睡眠结束");
				}
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("正在唤醒中。。。。。。");
					try{
						Thread.sleep(1000);
					} catch(Exception e){
						e.printStackTrace();
					}
				}
				System.out.println("唤醒成功！");
				t1.interrupt();//中断第一个线程
			}
		};
		t2.start();
		
	}
}
