package thread.method;
/**
 * Join�߳̿���
 * 1. ʲô���߳�Join
 * 		Thread�ṩ�ˣ���һ���̵߳ȴ���һ���߳���ɵķ���join()����
 * 2. ����join�ᷢ��������
 * 		����ĳ������ִ�����е��������̵߳�join()����ʱ�������߳̽���������
 *      ֱ����join()���������join�߳�ִ����Ϊֹ��
 * 3. Join��Ӧ��
 * 		join()����ͨ����ʹ���̵߳ĳ�����ã��Խ������⻮�ֳ�����С���⣬
 *      ÿ��С�������һ���̡߳������е�С���ⶼ�õ�������
 *      �ٵ������߳�����һ��������
 * @author sunddenly
 *
 */
public class TestThreadJoin {
	public static void main(String[] args) {
		final Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("�߳�-1-��ִ��......  "+i);
				}
				System.out.println("�߳�-1-ִ�����\n");
			}
		};
		final Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("�߳�-2-��ִ��......  "+i);
					if(i==50){
						System.out.println("�߳�-2-�ȴ�====�߳�1.....");
						try {
							t1.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("�߳�-2-ִ�����\n");
			}
		};
		Thread t3 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("�߳�-3-��ִ��......  "+i);
					if(i==50){
						System.out.println("�߳�-3-�ȴ�====�߳�2.....");
						try {
							t2.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("�߳�-3-ִ����ϣ�\n");
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
}