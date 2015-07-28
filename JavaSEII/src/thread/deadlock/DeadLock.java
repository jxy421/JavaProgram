package thread.deadlock;
public class DeadLock implements Runnable{ 
   A a=new A(); 
   B b=new B(); 
   public void init(){ 
      Thread.currentThread().setName("主线程"); 
      //调用a对象的foo()方法
      a.foo(b); 
      System.out.println("进入了主线程之后"); 
   } 
   public void run(){ 
      Thread.currentThread().setName("副线程"); 
      //调用b对象的bar()方法
      b.bar(a); 
      System.out.println("进入到副线程之后"); 
   } 
   public static void main(String[] args){ 
      DeadLock dl = new DeadLock(); 
      //以dl为target启动新线程
      new Thread(dl).start(); 
      //调用init方法
      dl.init(); 
   } 
} 

