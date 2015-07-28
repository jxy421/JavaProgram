package com.hebut.generic.constrcutor;
/**
 * 测试泛型构造器
 * @author sunddenly
 *
 */
public class DemoGenericConstructor {
	public static void main(String[] args) {
		Foo f1 = new Foo("String");
		Foo f2 = new Foo(11);
		//显示指定泛型构造器中的类型形参
		Foo f3 = new <String> Foo("<String>");
//		Foo f4 = new <String> Foo(3.14);//编译错误
		
	}
}

class Foo{
	public <T> Foo(T t){
		System.out.println(t);
	}
}
