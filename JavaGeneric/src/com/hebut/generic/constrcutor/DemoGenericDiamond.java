package com.hebut.generic.constrcutor;
/**
 * �����﷨�뷺�͹�����
 * @author sunddenly
 *
 */
public class DemoGenericDiamond {
	public static void main(String[] args) {
		//MyClass�������е�EΪString����
		//���͹�����������TΪInteger
		//ʹ���������﷨<>��ʾ������Ϣ
		MyClass<String> mc1 = new MyClass<>(5);
		//��ʾָ�����͹�������������TΪInteger
		MyClass<String> mc2 = new <Integer> MyClass<String>(5); 
		//MyClass�������е�EΪString����
		//���͹�����������TΪInteger
		//��ʱ�����ٴ�ʹ�������﷨����������Ϣ
//		MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}
class MyClass<E> {
	public <T> MyClass(T t){
		System.out.println("t�Ĳ���ֵΪ��"+t);
	}
}

