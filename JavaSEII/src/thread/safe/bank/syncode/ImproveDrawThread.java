package thread.safe.bank.syncode;

public class ImproveDrawThread extends Thread{ 
   private Account account; 
   private double drawAmount; 
   public ImproveDrawThread(String name,Account account,double drawAmount){ 
      super(name); 
      this.account=account; 
      this.drawAmount=drawAmount; 
   } 
   //������߳��޸�ͬһ����������ʱ�����漰���ݰ�ȫ����
   public void run(){ 
      /* 
       * ʹ��account��Ϊͬ�������������κ��سǽ��뵽ͬ�������֮ǰ
       * �����Ȼ�ö�Account������������������߳��޷��������Ҳ���޷��޸���
       * ���ַ������ϣ��������޸ġ��ͷ���
       */ 
      synchronized (account) { 
         //�˻�������ȡǮ��Ŀ
         if(account.getBalance()>=drawAmount){ 
            //ͻ����Ʊ
            System.out.println(getName()+"ȡǮ�ɹ����³���Ʊ��"+ drawAmount); 
            try{ 
               Thread.sleep(1); 
            }catch(InterruptedException ex){ 
               ex.printStackTrace(); 
            } 
            //�޸����
            account.setBalance(account.getBalance()-drawAmount); 
            System.out.println("\t���Ϊ��"+account.getBalance()); 
         } 
         else{ 
            System.out.println(getName()+"ȡǮʧ�����㣡ȡǮʧ�ܣ�"); 
         } 
      } 
      //ͬ���������������س��ͷ�ͬ����
   } 
} 