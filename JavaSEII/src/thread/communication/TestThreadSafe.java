package thread.communication;

import thread.communication.Bank.Person;

/**
 * ���̲߳�����ȫ
 * @author sunddenly
 *
 */
public class TestThreadSafe {
	public static void main(String[] args) throws InterruptedException {
		Bank bank = new Bank();
		/**
		 * �ڲ����ʵ������ʽ
		 */
		Person p1 = bank.new Person();
		Person p2 = bank.new Person();
		p1.setName("Person1");
		p2.setName("Person2");
		p1.start();
		p2.start();
		/**
		 * p1 ��p2����bank�����ϵȴ���������
		 */
		Thread.sleep(1000);
		bank.count=10000;
		synchronized (bank) {			
			bank.notifyAll();
		}
	}
}
class Bank{
	int count;
    synchronized void getMoney(int money){
		if(count==0){
			throw new RuntimeException("���Ϊ0");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count-=money;
    }
	class Person extends Thread{
		public void run(){
			System.out.println(Thread.currentThread().getName()+"׼��ȡǮ�����п��ţ�");
			try{
				synchronized (Bank.this){
					//��ǰ�̣߳�Person�������ж����ϵȴ�
					Bank.this.wait();
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			while(true){
				getMoney(200);
				System.out.println("��ǰ��"+count);
			}
		}
	}
}
