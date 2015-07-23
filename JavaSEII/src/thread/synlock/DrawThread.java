package thread.synlock;
public class DrawThread extends Thread {
   private Account account;// ģ���û��˻�
   private double drawAmount;// ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
 
   public DrawThread(String name, Account account, double drawAmount) {
      super(name);
      this.account = account;
      this.drawAmount = drawAmount;
   }
 
   // �������߳��޸�ͬһ����������ʱ�����漰�����ݰ�ȫ���⡣
   public void run(){ 
       /* 
        * ֱ�ӵ���account�����draw()������ִ��ȡǮ����
        * ͬ��������ͬ����������this��this�������draw()�����Ķ���
        * Ҳ����˵���߳̽���draw()����֮ǰ�������ȶ�account������м���
        */ 
       account.draw(drawAmount); 
   } 
}