package com.hebut.generic.constrcutor;
/**
 * ���Է��͹�����
 * @author sunddenly
 *
 */
public class DemoGenericConstructor {
	public static void main(String[] args) {
		Foo f1 = new Foo("String");
		Foo f2 = new Foo(11);
		//��ʾָ�����͹������е������β�
		Foo f3 = new <String> Foo("<String>");
//		Foo f4 = new <String> Foo(3.14);//�������
		
	}
}

class Foo{
	public <T> Foo(T t){
		System.out.println(t);
	}
}
