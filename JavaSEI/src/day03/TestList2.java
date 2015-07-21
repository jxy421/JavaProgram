package day03;

import java.util.ArrayList;
import java.util.List;

import day01.Point;

/**
 * 测试ArrayList
 * @author sunddenly
 *
 */
public class TestList2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		Point p3 = new Point(2,3);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list);
		/**
		 * contains(Object obj)
		 * 1. 检查给定对象obj是否被包含在集合中
		 * 2. 检查规则：将obj与集合中的每一个对象进行equals比较
		 */
		Point p = new Point(1,2);
		System.out.println("p集合存在吗？"+list.contains(p));
		list.remove(p);
		list.remove(p);
		System.out.println(list);
	}
}
