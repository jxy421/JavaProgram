package day03;
/**
 * ������̬�󶨵��������ڼ�Ķ��󷽷�
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Moo moo=new Noo(); //�����ͱ��������������Ͷ���
		moo.test(); //�����������ķ�������������д�ķ���
		//��̬�󶨵�Noo����ִ��Noo����ķ���
	}
}
class Moo{
	public void test(){
		System.out.println("Moo test");
	}
}
class Noo extends Moo{
	public void test(){
		System.out.println("Noo test");
	}
}
