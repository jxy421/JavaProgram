package thread.safe.bank.synmethod;
public class DrawThread extends Thread {
   private Account account;// 模拟用户账户
   private double drawAmount;// 当前取钱线程所希望取的钱数
 
   public DrawThread(String name, Account account, double drawAmount) {
      super(name);
      this.account = account;
      this.drawAmount = drawAmount;
   }
 
   // 当多条线程修改同一个共享数据时，将涉及到数据安全问题。
   public void run(){ 
       /* 
        * 直接调用account对象的draw()方法来执行取钱操作
        * 同步方法的同步监视器是this，this代表调用draw()方法的对象
        * 也就是说，线程进入draw()方法之前，必须先对account对象进行加锁
        */ 
       account.draw(drawAmount); 
} 


   }
