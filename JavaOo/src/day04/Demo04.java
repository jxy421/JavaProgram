package day04;

public class Demo04 {
	private final double a=0;
	public static void main(String[] args) {
		Cat tom=new Cat();
		Hunter hunt=tom;
		Runner run=tom;
		hunt.run();
		hunt.hunt();
		run.run();
		Cat cat=new Cat();
		cat.run();
		cat.hunt();
		
	}
}
class Cat implements Hunter,Runner{
	public void run(){
		System.out.println("run");
	}
	public void hunt(){
		System.out.println("hunt");
	}
}
interface Hunter extends Runner{
	void hunt();
}
interface Runner{
	int SPEED=100;
	void run();
}
