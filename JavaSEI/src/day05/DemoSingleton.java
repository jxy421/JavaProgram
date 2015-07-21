package day05;

public class DemoSingleton {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if(singleton1==singleton2){
			System.out.println("是同一个实例");
		}else{
			System.out.println("不是同一个实例");
		}
	}
}
