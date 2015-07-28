package thread.thread;

public class Test {
	public static void main(String[] args) {
		MyFirstThread t1 = new MyFirstThread();
		MySecondThread t2 = new MySecondThread();
		t1.start();
		t2.start();
	}
}
