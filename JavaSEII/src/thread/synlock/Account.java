package thread.synlock;

import java.util.concurrent.locks.ReentrantLock;

public class Account { 
   //����������
   private final ReentrantLock lock=new ReentrantLock(); 
   //��װ�˻���š��˻��������Field 
   private String accountNo; 
   private double balance; 
   //������
   public Account(String accountNo,double balance){ 
      this.accountNo=accountNo; 
      this.balance =balance; 
   } 
 
   public String getAccountNo() { 
      return accountNo; 
   } 
 
   public void setAccountNo(String accountNo) { 
      this.accountNo = accountNo; 
   } 
   //�˻�����������޸ģ�����ֻΪbalance�ṩgetter����
   public double getBalance() { 
      return this.balance; 
   } 
   //�ṩһ���̰߳�ȫ��draw()���������ȡǮ����
   public void draw(double drawAmount){ 
      //����
      lock.lock(); 
      try{ 
         //�˻�������ȥǮ��Ŀ
         if(balance>=drawAmount){ 
            //�³���Ʊ
            System.out.println(Thread.currentThread().getName()+"ȡǮ�ɹ����³���Ʊ"+drawAmount); 
            try{ 
               Thread.sleep(1); 
            }catch(InterruptedException ex){ 
               ex.printStackTrace(); 
            } 
            //�޸����
            balance-=drawAmount; 
            System.out.println("\t���Ϊ��"+balance); 
         }else{ 
            System.out.println(Thread.currentThread().getName()+"ȡǮʧ�ܣ�����!"); 
         } 
      }finally{ 
            //�޸���ɣ��ͷ���
            lock.unlock(); 
      } 
   } 
} 
