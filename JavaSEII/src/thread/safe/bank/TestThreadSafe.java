package thread.safe.bank;

import thread.safe.bank.Bank.Person;

/**
 * 多线程并发安全
 * @author sunddenly
 *
 */
public class TestThreadSafe {
	public static void main(String[] args) {
		Bank bank = new Bank();
		/**
		 * 内部类的实例化方式
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
	 * synchronized修饰方法后，会为方法上锁。
	 * 方法就不是异步的了，而是同步的
	 * synchronized同步块
	 * synchronized(Object){
	 * 		需要同步的代码片段
	 * }
	 * 这里需要注意：
	 * Object需要确保所有线程看到的是同一个对象
	 * 否则看不到同步效果
	 * 好处：同步代码块效率高与同步方法，因为可以只对一部分
	 * 代码块上锁即可，不用全上锁
	 * 案例：商店功能 选衣服和试衣服 不能为了试衣服将整个商店功能上锁
	 * 
	 */
	/**
	 * 在方法中this对所有的线程来说是唯一的
	 * 所以可以对this进行监视上锁
	 * 当p1进到同步代码块时，要对this进行上锁，上完锁顺序执行
	 * 当p2进到同步代码块时，也要对上面的
	 * @param money
	 */
//	 void getMoney(int money){
//		synchronized (this){//this指的是bank,
//			if(count==0){
//				throw new RuntimeException("余额为0");
//			}
//			count-=money;
//		}
//	}
//	 void getMoney(int money){
//		synchronized (new ArrayList()){//反面教材
//			if(count==0){
//				throw new RuntimeException("余额为0");
//			}
//			count-=money;
//		}
//	}
//	synchronized void getMoney(int money){
//		if(count==0){
//			throw new RuntimeException("余额为0");
//		}
//		count-=money;
//	}
	synchronized void getMoney(int money){
		if(count==0){
			throw new RuntimeException("余额为0");
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
				System.out.println("当前余额："+count);
			}
		}
	}
}

