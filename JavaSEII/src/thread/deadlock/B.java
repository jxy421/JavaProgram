package thread.deadlock;
public class B { 
   public synchronized void bar(A a){ 
      System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"������Bʵ����bar����"); 
      try{ 
         Thread.sleep(200); 
      }catch(InterruptedException ex){ 
         ex.printStackTrace(); 
      } //f
      System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"��ͼ����Aʵ����last����"); 
      a.last(); 
   } 
   public synchronized void last() { 
      System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"���뵽��B���last����"); 
   } 
} 