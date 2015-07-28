package thread.daemon;
/**
 * ��̨�߳��ػ��߳�
 * �ص㣺
 * 		��ǰ�����е�����ǰ̨�̶߳������󣬺�̨�߳�ǿ������
 *      �����Ƿ�������
 * @author sunddenly
 * ע�⣺
 * ����Ҫ��ĳ���߳�����Ϊ��̨�̣߳������ڸ��߳�����֮ǰ���ã�
 * Ҳ����˵setDaemon(true)������start()����֮ǰ���ã�
 * ���������IllegaIThreadStateException�쳣
 *
 */
public class DaemonThread {
	public static void main(String[] args) {
		Thread daemon = new Thread("daemon"){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println(getName()+" "+i);
				}
			}
		};
		daemon.setDaemon(true);
		daemon.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println("main�߳̽�����");
	}
}