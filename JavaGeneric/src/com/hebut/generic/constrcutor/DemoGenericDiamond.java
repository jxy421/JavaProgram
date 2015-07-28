package com.hebut.generic.constrcutor;
/**
 * 菱形语法与泛型构造器
 * @author sunddenly
 *
 */
public class DemoGenericDiamond {
	public static void main(String[] args) {
		//MyClass类声明中的E为String类型
		//泛型构造器声明的T为Integer
		//使用了菱形语法<>表示泛型信息
		MyClass<String> mc1 = new MyClass<>(5);
		//显示指定泛型构造器中声明的T为Integer
		MyClass<String> mc2 = new <Integer> MyClass<String>(5); 
		//MyClass类声明中的E为String类型
		//泛型构造器声明的T为Integer
		//此时不能再次使用菱形语法来代表泛型信息
//		MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}
class MyClass<E> {
	public <T> MyClass(T t){
		System.out.println("t的参数值为："+t);
	}
}

