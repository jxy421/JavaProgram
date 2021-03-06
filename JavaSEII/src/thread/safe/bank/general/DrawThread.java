package thread.safe.bank.general;
public class DrawThread extends Thread {
   private Account account;// 模拟用户账户
   private double drawAmount;// 当前取钱线程所希望取的钱数
 
   public DrawThread(String name, Account account, double drawAmount) {
      super(name);
      this.account = account;
      this.drawAmount = drawAmount;
   }
 
   // 当多条线程修改同一个共享数据时，将涉及到数据安全问题。
   public void run() {
      // 账户余额大于取钱数目
      if (account.getBalance() >= drawAmount) {
    	 try {
			Thread.sleep(1);
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
    	 // 修改余额
         account.setBalance(account.getBalance() - drawAmount);

         // 吐出钞票
         System.out.println(getName() + "取钱成功！吐出钞票:" + drawAmount);
         /**
          * 当把修改余额放在最后，经常出现余额负数
          * 基本不用sleep
          */
         //account.setBalance(account.getBalance() - drawAmount);
         System.out.println("\t余额为: " + account.getBalance());
      } else {
         System.out.println(getName() + "取钱失败！余额不足！");
      }
   }
}
