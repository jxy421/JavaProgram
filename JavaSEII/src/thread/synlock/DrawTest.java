package thread.synlock;
public class DrawTest { 
    public static void main(String[] args) { 
        // 创建一个账户
        Account acct = new Account("1234567", 1000.0); 
        // 模拟两个线程对同一个账户取钱
        new DrawThread("甲", acct, 600).start(); 
        new DrawThread("乙", acct, 600).start(); 
    } 
} 
