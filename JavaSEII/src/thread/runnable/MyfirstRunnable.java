package thread.runnable;
/**
 * Runnable �ӿ�
 * @author sunddenly
 *
 */
public class MyfirstRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100000;i++){
			System.out.println("����"+i);
		}
	}

}
