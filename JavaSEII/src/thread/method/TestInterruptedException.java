package thread.method;
/**
 * �ж��쳣��ʾ
 * @author sunddenly
 *
 */
public class TestInterruptedException {
	public static void main(String[] args) {
		/**
		 * ����˯������
		 * �����ж������оֲ��ڲ��ࣺ�ֲ��ڲ����У�
		 * �������õ�ǰ�����������ֲ�������
		 * ��ô�ñ���������final��
		 */
		final Thread t1 =new Thread(){
			public void run(){
				System.out.println("����˯�ߡ���������");
				try{
					Thread.sleep(1000000);
				} catch(InterruptedException e){
					System.out.println("�̻߳��ѣ�t1˯�߽���");
				}
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("���ڻ����С�����������");
					try{
						Thread.sleep(1000);
					} catch(Exception e){
						e.printStackTrace();
					}
				}
				System.out.println("���ѳɹ���");
				t1.interrupt();//�жϵ�һ���߳�
			}
		};
		t2.start();
		
	}
}