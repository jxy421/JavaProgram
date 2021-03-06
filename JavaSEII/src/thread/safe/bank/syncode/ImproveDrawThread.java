package thread.safe.bank.syncode;

public class ImproveDrawThread extends Thread{ 
   private Account account; 
   private double drawAmount; 
   public ImproveDrawThread(String name,Account account,double drawAmount){ 
      super(name); 
      this.account=account; 
      this.drawAmount=drawAmount; 
   } 
   //当多个线程修改同一个共享数据时，将涉及数据安全问题
   public void run(){ 
      /* 
       * 使用account作为同步监视器，在任何县城进入到同步代码快之前
       * 必须先获得对Account对象的锁定，而其他线程无法获得锁，也就无法修改它
       * 这种方法符合：加锁→修改→释放锁
       */ 
      synchronized (account) { 
         //账户余额大于取钱数目
         if(account.getBalance()>=drawAmount){ 
            //突出钞票
            System.out.println(getName()+"取钱成功！吐出钞票："+ drawAmount); 
            try{ 
               Thread.sleep(1); 
            }catch(InterruptedException ex){ 
               ex.printStackTrace(); 
            } 
            //修改余额
            account.setBalance(account.getBalance()-drawAmount); 
            System.out.println("\t余额为："+account.getBalance()); 
         } 
         else{ 
            System.out.println(getName()+"取钱失败余额不足！取钱失败！"); 
         } 
      } 
      //同步代码块结束，该县程释放同步锁
   } 
} 
