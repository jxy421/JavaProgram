package day05;

public class DemoSingleton {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if(singleton1==singleton2){
			System.out.println("��ͬһ��ʵ��");
		}else{
			System.out.println("����ͬһ��ʵ��");
		}
	}
}
