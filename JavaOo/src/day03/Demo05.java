package day03;
/**
 * ���غ���д�Ĳ��
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Woo w = new Woo();
		Super s = new Sub();
		w.t(s);//���صķ��������ɣ�����s����Super�����������Sub�޹�
	}
}
class Woo{
	public void t(Super obj){
		System.out.println("Goo t(Super)");
		obj.s();
	}
	public void t(Sub obj){
		System.out.println("Goo t(Sub)");
		obj.s();
	}
}
class Super{
	public void s(){
		System.out.println("Super s()");
	}
}
class Sub extends Super{
	public void s(){
		System.out.println("Sub s()");
	}
}
