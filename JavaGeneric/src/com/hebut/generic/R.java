package com.hebut.generic;

public class R<T>{
	private T info;
	/** 编译错误，不能在静态Fields中声明使用类型形参  **/
//	private static T tag;
	
	public void foo(T msg){}
	/** 编译错误，不能在静态方法中使用类型形参 **/
//	public void static bar(T msg){}
}
