package thread.safe.bank.syncode;
public class DrawTest { 
    public static void main(String[] args) { 
        // ����һ���˻�
        Account acct = new Account("1234567", 1000.0); 
        // ģ�������̶߳�ͬһ���˻�ȡǮ
        new ImproveDrawThread("��", acct, 600).start(); 
        new ImproveDrawThread("��", acct, 600).start(); 
    } 
} 
