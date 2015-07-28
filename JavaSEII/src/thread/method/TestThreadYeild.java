package thread.method;
/**
 * �̵߳ķ���
 * @author sunddenly
 *	static void yield()
 *      ��ǰ�߳��ó����������뿪Running״̬����������ǰʱ��Ƭ��
 *      ��������Runnable״̬�ȴ���
 *  final void setPriority(int)��
 *  	�����߳����ȼ������ȼ�Խ�ߵ��̣߳������ϻ�ȡcpu�Ĵ�����Խ�ࡣ
 *      ����������ʵ���в��ġ��������߳����ȼ�һ��Ҫ���߳�����ǰ���ã�
 *  final void join()��
 *  	�ȴ����߳���ֹ
 */
public class TestThreadYeild {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("����"+"�߳�---1");
					Thread.yield();
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("����"+"�߳�---2");
					Thread.yield();
				}
			}
		};
		Thread t3 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("����"+"�߳�--2");
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