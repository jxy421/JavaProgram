package day03;

public class TestObjectArray {
	public static void main(String[] args) {
		Person person = new Person();
		person.age=16;
		System.out.println(person.age);
		
		/**
		 * ΪʲôPerson[0].age=16
		 * �ᱨ��ָ���쳣
		 * ����ĳ�ʼ����
		 * 			 1. �������������ʼ����ÿ��Ԫ��Ĭ��Ϊnull
		 * 			 2. �������������ʼ����ÿ��Ԫ��Ĭ��Ϊ�����������͵�Ĭ��ֵ
		 */
		//�������������ʼֵΪ0
		//���Է���
		int[] a= new int[5];
		System.out.println(a[0]);
		//�����������������ʼ��Ϊnull
		//null���ܷ���age
		Person[] persons =new Person[5];
		persons[0].age=16;
		System.out.println(person.age);
		
	}
}
class Person{
	int age;
	
}