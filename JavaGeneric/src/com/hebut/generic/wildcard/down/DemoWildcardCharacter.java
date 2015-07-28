package com.hebut.generic.wildcard.down;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * 测试通配符下限
 * @author sunddenly
 */
public class DemoWildcardCharacter {
	public static <T> T copy(Collection<? super T> des, Collection<T> src){
		T last=null;
		for (T ele : src) {
			last=ele;
			des.add(ele);
		}
		return last;
	}
	public static void main(String[] args) {
		List<Number> ln = new ArrayList<Number>();
		List<Integer> li = new ArrayList<Integer>();
		li.add(5);
		li.add(6);
		/**
		 * 此处可以准确直到最后一个元素是Integer类型
		 * 与src集合的元素类型的相同
		 */
		Integer last = copy(ln, li);
		System.out.println("Last: "+last);
	}
}


