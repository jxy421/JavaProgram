package day03;

public class Demo03 {
	public static void main(String[] args) {
		Aoo boo = new Boo();
	}
}
class Aoo{
	int a=1;
	public Aoo(){
		this.test();//由于test是private方法，不能被继承重写，所以调用当前类型的的方法
	}
	private void test(){
		System.out.println("Aoo "+a);
	}
}
class Boo extends Aoo{
	int b=2;
	public Boo(){}
	public void test(){
		System.out.println("Boo "+a+","+b);
	}
}