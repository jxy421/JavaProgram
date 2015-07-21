package day03;

public class TestObjectArray {
	public static void main(String[] args) {
		Person person = new Person();
		person.age=16;
		System.out.println(person.age);
		
		/**
		 * 为什么Person[0].age=16
		 * 会报空指针异常
		 * 数组的初始化：
		 * 			 1. 引用类型数组初始化，每个元素默认为null
		 * 			 2. 基本类型数组初始化，每个元素默认为基本数据类型的默认值
		 */
		//基本类型数组初始值为0
		//可以访问
		int[] a= new int[5];
		System.out.println(a[0]);
		//由于引用类型数组初始化为null
		//null不能访问age
		Person[] persons =new Person[5];
		persons[0].age=16;
		System.out.println(person.age);
		
	}
}
class Person{
	int age;
	
}