package day04;

public class Demo01 {
	public static void main(String[] args) {
		new Goo();
		new Goo();
	}
}
class Goo{
	{//����飬�ڴ��������ʱ��ִ�У������ڹ�����������
		System.out.println("Hi");
	}
	static{//��̬����飬����������ִ�У�ִֻ��һ��
		System.out.println("loading Goo.class");
	}//ϵͳ��������Դ
}