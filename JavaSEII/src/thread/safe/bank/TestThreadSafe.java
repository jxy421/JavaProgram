package thread.safe.bank;

import thread.safe.bank.Bank.Person;

/**
 * ���̲߳�����ȫ
 * @author sunddenly
 *
 */
public class TestThreadSafe {
	public static void main(String[] args) {
		Bank bank = new Bank();
		/**
		 * �ڲ����ʵ������ʽ
		 */
		Person p1 = bank.new Person();
		Person p2 = bank.new Person();
		p1.start();
		p2.start();
	}
}
class Bank{
	int count  = 10000;
	/**
	 * synchronized���η����󣬻�Ϊ����������
	 * �����Ͳ����첽���ˣ�����ͬ����
	 * synchronizedͬ����
	 * synchronized(Object){
	 * 		��Ҫͬ���Ĵ���Ƭ��
	 * }
	 * ������Ҫע�⣺
	 * Object��Ҫȷ�������߳̿�������ͬһ������
	 * ���򿴲���ͬ��Ч��
	 * �ô���ͬ�������Ч�ʸ���ͬ����������Ϊ����ֻ��һ����
	 * ������������ɣ�����ȫ����
	 * �������̵깦�� ѡ�·������·� ����Ϊ�����·��������̵깦������
	 * 
	 */
	/**
	 * �ڷ�����this�����е��߳���˵��Ψһ��
	 * ���Կ��Զ�this���м�������
	 * ��p1����ͬ�������ʱ��Ҫ��this����������������˳��ִ��
	 * ��p2����ͬ�������ʱ��ҲҪ�������
	 * @param money
	 */
//	 void getMoney(int money){
//		synchronized (this){//thisָ����bank,
//			if(count==0){
//				throw new RuntimeException("���Ϊ0");
//			}
//			count-=money;
//		}
//	}
//	 void getMoney(int money){
//		synchronized (new ArrayList()){//����̲�
//			if(count==0){
//				throw new RuntimeException("���Ϊ0");
//			}
//			count-=money;
//		}
//	}
//	synchronized void getMoney(int money){
//		if(count==0){
//			throw new RuntimeException("���Ϊ0");
//		}
//		count-=money;
//	}
	synchronized void getMoney(int money){
		if(count==0){
			throw new RuntimeException("���Ϊ0");
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		count-=money;
    }
	class Person extends Thread{
		public void run(){
			while(true){
				getMoney(100);
				System.out.println("��ǰ��"+count);
			}
		}
	}
}
