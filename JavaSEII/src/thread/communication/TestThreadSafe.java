package thread.communication;

import thread.communication.Bank.Person;

/**
 * 多线程并发安全
 * @author sunddenly
 *
 */
public class TestThreadSafe {
	public static void main(String[] args) throws InterruptedException {
		Bank bank = new Bank();
		/**
		 * 内部类的实例化方式
		 */
		Person p1 = bank.new Person();
		Person p2 = bank.new Person();
		p1.setName("Person1");
		p2.setName("Person2");
		p1.start();
		p2.start();
		/**
		 * p1 和p2都在bank对象上等待进入阻塞
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
			throw new RuntimeException("余额为0");
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
			System.out.println(Thread.currentThread().getName()+"准备取钱等银行开门！");
			try{
				synchronized (Bank.this){
					//当前线程（Person）在银行对象上等待
					Bank.this.wait();
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			while(true){
				getMoney(200);
				System.out.println("当前余额："+count);
			}
		}
	}
}

