package com.hebut.generic.wipeshift;
/**
 * 测试泛型擦除转换
 * @author sunddenly
 * 
 */
public class DemoGenericWipeShift {
	public static void main(String[] args) {
		Foo<Integer> f1 = new Foo<>();
		//f1的getSize()方法返回Integer对象
		Integer size1 = f1.getSize();
		//把f1赋给f2，丢失尖括号里的类型信息
		Foo f2 = f1;
		//f2只知道size的类型是Number
		Number size2 = f2.getSize();
		//下面的代码将会引起编译错误
//		Integer size3 = f2.getSize();
	}
}
class Foo<T extends Number>{
	T size;
	public Foo(T size) {
		this.size = size;
	}
	public Foo() {
	}
	public T getSize() {
		return size;
	}
	public void setSize(T size) {
		this.size = size;
	}
}