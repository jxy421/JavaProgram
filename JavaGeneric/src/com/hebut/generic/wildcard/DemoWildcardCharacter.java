package com.hebut.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型通配符测试
 * @author sunddenly
 *
 */
public class DemoWildcardCharacter {
	public static void Test1(List list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	public static void Test2(List<Object> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static void Test3(List<?> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("Jim");
		Test1(list);
		/**
		 * 编译错误List<String> 不能作为 List<Object>子类
		 */
		//Test2(list);
		/**
		 * 可以使用List<?>作为 所有List<>的父类
		 */
		Test3(list);
		List<?> list2 = list;//new ArrayList<String>();
		list2.add(null);
//		list2.add("JOney");//编译错误
		System.out.println(list2.get(1));
		
		
	}
}
