package day03;

import java.util.ArrayList;

/**
 * 自定义泛型
 * 
 * @author sunddenly 1. 可以动态改变类型，增加程序的灵活性
 * 
 */
public class DefineGenericity {
	public static void main(String[] args) {
		// Point<Integer> p1 = new Point<Integer>(1, 1);
		// Point<Long> p2 = new Point<Long>(1l, 2l);
		// Point<Double> p3 = new Point<Double>(1.5, 1.5);
		// System.out.println(p1);
		// System.out.println(p2);
		// System.out.println(p3);
		Point2<Long, Integer, String> p = new Point2<Long, Integer, String>(1l,
				2, "3");
		Point2<Long, Integer, String> p21 = new Point2<Long, Integer, String>(
				1l, 2, "3");
		Point2<Long, Integer, String> p22 = new Point2<Long, Integer, String>(
				2l, 2, "3");
		ArrayList<Point2<Long, Integer, String>> list = new ArrayList<Point2<Long, Integer, String>>();
		list.add(p21);
		list.add(p22);
		/**
		 * 使用新循环遍历集合
		 * 
		 * 注意： 1. 集合使用新循环，应该为其定义泛型 2. 否则我们只能使用Object来接受元素的类型 3. 通常情况下都要使用泛型 4.
		 * 新循环遍历的类型要兼容集合中的元素类型
		 */

		System.out.println(list.contains(p));
		for (Point2<Long, Integer, String> point2 : list) {
			System.out.println(point2);
		}
	}
}
