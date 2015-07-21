package day03;

import java.util.ArrayList;

/**
 * ArrayList 测试
 * @author hdoop
 *
 */
public class TestList3 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList list3 = new ArrayList();
		list1.add("one");
		list1.add("two");
		list1.add("Three");
		list2.add("four");
		list2.add("five");
		list3.add("one");
		list3.add("two");
		/**
		 * 集合2放入1中
		 * addAll(Collection c)
		 */
		list1.addAll(list2);//[one, two, Three, four, five]
		System.out.println(list1);
		/**
		 * removeAll()
		 * 删除交集部分
		 */
		list1.removeAll(list3);//[four, five]
		System.out.println(list1);
		/**
		 * retainAll(list2)
		 * 取交集
		 */
		list1.retainAll(list2);
		System.out.println(list1);
	}
}
