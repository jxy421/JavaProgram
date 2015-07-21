package day03;

import java.util.ArrayList;

/**
 * List元素修改于查询
 * @author hdoop
 *
 */
public class TestList4 {
	public static void main(String[] args) {
		/**
		 * 获取元素
		 * get(index)
		 * 根据下表获取元素
		 */
		ArrayList list1 = new ArrayList();
		list1.add("one");
		list1.add("two");
		list1.add("Three");
		String ele=(String)list1.get(2);
		System.out.println(ele);
		//集合遍历
//		for(int i=0;i<list1.size();i++){
//			System.out.println(list1.get(i));
//		}
//		for (Object object : list1) {
//			System.out.println(object);
//		}
		/**
		 * 修改/替换集合元素
		 * Object set(int index,Object newElement)
		 * 1. 将index位置的元素修改为newElement
		 * 2. 修改后的元素会被返回
		 */
		Object old = list1.set(2, "三");
		System.out.println("被替换元素："+old);
		System.out.println(list1);
		/**
		 * 插入集合元素
		 * add(int index,Object new Element)
		 * 1. add的重载方法
		 * 2. 向index指定位置插入newElement
		 * 3. 原位置元素后后移
		 * 4. 所谓插队
		 * 0    1    2
		 * one two  three
		 */
		list1.add(2,"二");
		System.out.println(list1);
		/**
		 * 根据下标删除元素
		 * Object remove(int index)
		 * 1. 将集合中下标为index的元素删除
		 * 2. 返回删除元素
		 * boolean remove(Object obj)
		 * 1. remove的重载方法
		 * 2. 放回是否被删除
		 */
		Object obj=list1.remove(1);
		System.out.println("被删除元素："+obj);
		System.out.println(list1);
	}
}
