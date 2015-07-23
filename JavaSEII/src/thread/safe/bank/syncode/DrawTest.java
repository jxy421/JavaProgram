package thread.safe.bank.syncode;
public class DrawTest { 
    public static void main(String[] args) { 
        // 创建一个账户
        Account acct = new Account("1234567", 1000.0); 
        // 模拟两个线程对同一个账户取钱
        new ImproveDrawThread("甲", acct, 600).start(); 
        new ImproveDrawThread("乙", acct, 600).start(); 
    } 
} 
