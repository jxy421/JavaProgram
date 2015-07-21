package day04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set集合 无序且不重复集合
 * 常用实现类
 * 			HashSet：使用散列算法实现的Set集合
 * @author sunddenly
 *
 */
public class DemoSet {
	public static void main(String[] args) {
		/*
		 * 实例化一个HashSet集合
		 */
		Set<String> set = new HashSet<String>();
		/*
		 * 向集合中添加元素
		 * add()
		 * 因为无序，但是add()方法不是向集合尾部追加元素
		 */
		set.add("One");
		set.add("Two");
		set.add("Three");
		/*
		 * 没有get(int index)方法
		 * 所以不能根据下标获取元素
		 * 遍历需要使用Iterator/foreach
		 */
		/**
		 * 无序：Hash存的顺序和放入顺序不一样
		 * Hashset是set的实现类，通过hash表的方式实现
		 * 在将对象放入HashSet时，需要获取对象的hashcode值
		 * 通过hash算法索引到对应的存储空间
		 * 好处：高效的查询
		 * 特色：将元素和存储位置关联起来
		 * find(key)时，HashSet()更优
		 * find(index)时，list/array更合适
		 */
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		/**
		 * 
		 */

//		for (String string : set) {
//			System.out.print(string+" ");
//		}
		
	}
}
