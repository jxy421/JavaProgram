package com.hebut.generic.wildcard.down;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 测试TreeSet中的Comparator
 * @author sunddenly
 *
 */
public class DemoTreeSet {
	public static void main(String[] args) {
		//Comparator的实际类型是TreeSet里实际类型的父类
		TreeSet<String> ts1 = new TreeSet<String>(new Comparator<Object>(){
			@Override
			public int compare(Object o1, Object o2) {
				
				return o1.hashCode()> o2.hashCode()?1
					   : o1.hashCode()<o2.hashCode()?-1:0;
			}
		}); 
		ts1.add("qeq");
		ts1.add("ad2");
		ts1.add("ada1");
		System.out.println(ts1);
		TreeSet<String> ts2 = new TreeSet<String>(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length()>o2.length()?1
						:o1.length()<o2.length()?-1:0;
			}
		});
		ts2.add("12313123");
		ts2.add("12");
		ts2.add("2345");
		System.out.println(ts2);
	}
}
