package day03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator 测试遍历集合中的元素
 * 概述：
 * 		1. 所有Collection的实现类都实现了iterator方法
 * 		2. 该方法返回一个Iterator接口类型对象
 * Itertor接口方法
 * 		1. boolean hasnext()判断指针后面是否还有元素
 * 		2. E next() 指针后移返回当前元素
 * 		3. void remove()在原集合中删除刚刚返回元素
 * @author sunddenly
 *
 */
public class TestIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("One");
		list.add("#");
		list.add("Two");
		list.add("#");
		list.add("Three");
		list.add("#");
		Iterator it = list.iterator();
		/*
		 * 迭代器的使用
		 * 1. hasnext(),next()
		 * 2. 迭代过程中，我们不能够通过集合进行增删改查
		 * 3. 要删除则使用iterator
		 * 4. remove方法可以将刚刚获取的元素删除，即当前next()指向的元素
		 * 5. 删除方法不能够被调用两次
		 */
		while(it.hasNext()){
			String ele = (String) it.next();
			if("#".equals(ele)){
				//list.remove(ele);不可以
				it.remove();//删除当前元素
			}
			System.out.println(ele);
		}
		System.out.println(list);
	}
}
