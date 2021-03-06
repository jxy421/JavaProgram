package thread.safe.bank.synmethod;
public class Account { 
   //��װ�˻���š��˻��������Field 
   private String accountNo; 
   private double balance; 
   //������
   public Account(){ 
   } 
   public Account(String accountNo,double balance){ 
      this.accountNo=accountNo; 
      this.balance=balance; 
   } 
   public String getAccountNo() { 
      return accountNo; 
   } 
   public void setAccountNo(String accountNo) { 
      this.accountNo = accountNo; 
   } 
   public double getBalance() { 
      return balance; 
   } 
   @Override 
   public boolean equals(Object obj) { 
      if(obj!=null&&obj.getClass()==Account.class){ 
         Account target=(Account)obj; 
         return target.getAccountNo().equals(accountNo); 
      } 
      return false; 
   } 
   @Override 
   public int hashCode() { 
      return accountNo.hashCode(); 
   } 
   public synchronized void draw(double drawAmount){ 
      if(balance>=drawAmount){//�˻�������ȡǮ��Ŀ
         //�³���Ʊ
         System.out.println(Thread.currentThread().getName()+"ȡǮ�ɹ����³���Ʊ��"+drawAmount); 
         try{ 
            Thread.sleep(1); 
         }catch(InterruptedException ex){ 
            ex.printStackTrace(); 
         } 
         //�޸����
         balance-=drawAmount; 
         System.out.println("\t���Ϊ��"+balance); 
      }else{ 
         System.out.println(Thread.currentThread().getName()+"���㣡ȡǮʧ�ܣ�"); 
      } 
   } 
} 
