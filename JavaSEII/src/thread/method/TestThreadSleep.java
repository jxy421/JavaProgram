package thread.method;
/**
 * sleep()测试
 * @author sunddenly
 *
 */
public class TestThreadSleep {
	public static void main(String[] args) {
		/**
		 * Thread.sleep(long time)
		 * 主动进入阻塞状态time毫秒后回到Runnable状态
		 * 
		 */
		int i = 0;
		while(true){
			System.out.println(i+"秒");
			i++;
			try{
				/**
				 * 使用Thread.sleep()方法阻塞线程时，
				 * 强制让我们必须捕获“中断异常”。
				 * 引发情况：
				 *  当前线程处于Sleep阻塞期间，被另一个线程中断阻塞状态时，
				 *  当前线程会抛出该异常
				 */
				Thread.sleep(100000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
