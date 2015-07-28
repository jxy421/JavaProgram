package com.hebut.generic;

public class Test {
	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		fruit.setInfo(1);
		System.out.println(fruit.getInfo());
		
		Orange o = new Orange();
//		o.setInfo(1);//编译错误，Integer无法转换为String类型
		o.setInfo("Orange");
		System.out.println(o.getInfo());
		
		Banana b = new Banana();
		b.setInfo("banana");
		System.out.println(b.getInfo());
		
		Pear<String,Integer> p = new Pear<String,Integer>();
		p.setInfo("Pear");
		p.setVersion(1034);
		System.out.println(p.getInfo()+","+p.getVersion());
		
	}
}
