package thread.safe.bank.general;
public class DrawThread extends Thread {
   private Account account;// ģ���û��˻�
   private double drawAmount;// ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
 
   public DrawThread(String name, Account account, double drawAmount) {
      super(name);
      this.account = account;
      this.drawAmount = drawAmount;
   }
 
   // �������߳��޸�ͬһ����������ʱ�����漰�����ݰ�ȫ���⡣
   public void run() {
      // �˻�������ȡǮ��Ŀ
      if (account.getBalance() >= drawAmount) {
    	 try {
			Thread.sleep(1);
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
    	 // �޸����
         account.setBalance(account.getBalance() - drawAmount);

         // �³���Ʊ
         System.out.println(getName() + "ȡǮ�ɹ����³���Ʊ:" + drawAmount);
         /**
          * �����޸���������󣬾�����������
          * ��������sleep
          */
         //account.setBalance(account.getBalance() - drawAmount);
         System.out.println("\t���Ϊ: " + account.getBalance());
      } else {
         System.out.println(getName() + "ȡǮʧ�ܣ����㣡");
      }
   }
}