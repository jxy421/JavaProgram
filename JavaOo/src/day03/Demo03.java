package day03;

public class Demo03 {
	public static void main(String[] args) {
		Aoo boo = new Boo();
	}
}
class Aoo{
	int a=1;
	public Aoo(){
		this.test();//����test��private���������ܱ��̳���д�����Ե��õ�ǰ���͵ĵķ���
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