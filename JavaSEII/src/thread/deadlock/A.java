package thread.deadlock;
public class A { 
   public synchronized void foo(B b){ 
      System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"������Aʵ����foo����"); 
      try{ 
         Thread.sleep(200); 
      }catch(InterruptedException ex){ 
         ex.printStackTrace(); 
      } 
      System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"��ͼ����Bʵ����last����"); 
      b.last(); //m
   } 
   public synchronized void last(){ 
      System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"���뵽��Aʵ����last����"); 
   } 
} 