package thread.deadlock;
public class DeadLock implements Runnable{ 
   A a=new A(); 
   B b=new B(); 
   public void init(){ 
      Thread.currentThread().setName("���߳�"); 
      //����a�����foo()����
      a.foo(b); 
      System.out.println("���������߳�֮��"); 
   } 
   public void run(){ 
      Thread.currentThread().setName("���߳�"); 
      //����b�����bar()����
      b.bar(a); 
      System.out.println("���뵽���߳�֮��"); 
   } 
   public static void main(String[] args){ 
      DeadLock dl = new DeadLock(); 
      //��dlΪtarget�������߳�
      new Thread(dl).start(); 
      //����init����
      dl.init(); 
   } 
} 

