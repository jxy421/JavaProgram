package thread.method;
/**
 * sleep()����
 * @author sunddenly
 *
 */
public class TestThreadSleep {
	public static void main(String[] args) {
		/**
		 * Thread.sleep(long time)
		 * ������������״̬time�����ص�Runnable״̬
		 * 
		 */
		int i = 0;
		while(true){
			System.out.println(i+"��");
			i++;
			try{
				/**
				 * ʹ��Thread.sleep()���������߳�ʱ��
				 * ǿ�������Ǳ��벶���ж��쳣����
				 * ���������
				 *  ��ǰ�̴߳���Sleep�����ڼ䣬����һ���߳��ж�����״̬ʱ��
				 *  ��ǰ�̻߳��׳����쳣
				 */
				Thread.sleep(100000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}