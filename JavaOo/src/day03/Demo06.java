package day03;
/**
 * ��̬����
 * 1. ��̬������������ڼ��ʼ�������ڷ�������
 * 2. ��ȫ��������һ�ݱ���
 * 3. ����ʹ���������ʾ�̬����
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Cat c1=new Cat(5);
		Cat c2=new Cat(6);
		System.out.println(c1.age+","+c2.age+","+Cat.numOfCats);
	}
}
class Cat{
	int age; //ʵ��������ÿ������һ��
	static int numOfCats=0;//��̬������ֻ��һ��
	public Cat(int age){
		this.age=age;
		numOfCats++;
	}
}

