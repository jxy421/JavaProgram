package thread.synlock;
public class DrawTest { 
    public static void main(String[] args) { 
        // ����һ���˻�
        Account acct = new Account("1234567", 1000.0); 
        // ģ�������̶߳�ͬһ���˻�ȡǮ
        new DrawThread("��", acct, 600).start(); 
        new DrawThread("��", acct, 600).start(); 
    } 
} 
