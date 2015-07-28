package com.hebut.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ͨ�������
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
		 * �������List<String> ������Ϊ List<Object>����
		 */
		//Test2(list);
		/**
		 * ����ʹ��List<?>��Ϊ ����List<>�ĸ���
		 */
		Test3(list);
		List<?> list2 = list;//new ArrayList<String>();
		list2.add(null);
//		list2.add("JOney");//�������
		System.out.println(list2.get(1));
		
		
	}
}
