package day03;

import java.util.ArrayList;
/**
 * List测试
 * 1. Lsit是一个接口不可实例化
 * 2. ArrayList  线性表
 * 3. LinkedList 链表
 * @author sunddenly
 *
 */
public class TestList {
	public static void main(String[] args) {
		/**
		 * 创建一个ArrayList实例
		 * List和ArrayList均处于java.util包下
		 * 1.不需考虑容量，根据元素自动扩充
		 * 2.元素的容量根据所保存的元素来决定
		 */
		/*
		 * add方法：add(Object obj)
		 * 1.可以放任意类型的元素，因为add的参数是Object类型
		 * 2.很少向集合中存放多种类型，因为取得时候很麻烦
		 */
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		list.add(1);
		/**
		 * ArrayList重写了toString()方法
		 * 返回的是，ArrayList元素的toString()方法
		 */
		System.out.println("元素数量："+list.size());
		System.out.println("元素内容："+list);
		
		//清空集合
		list.clear();
		System.out.println("元素数量："+list.size());
		System.out.println("集合是空吗？"+list.isEmpty());

		
	}
}
