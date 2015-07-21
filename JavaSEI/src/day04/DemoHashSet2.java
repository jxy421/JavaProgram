package day04;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet特点
 * @author sunddenly
 *
 */
public class DemoHashSet2 {
	public static void main(String[] args) {
		/**
		 * 定义一个set集合，允许里面存放Point实例
		 */
		Set<Point> set = new HashSet<Point>();
		/**
		 * 创建两个内容一样的对象
		 */
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		System.out.println("p1和p2是否为同一对象："+(p1==p2));
		System.out.println("p1和p2内容是否一样"+p1.equals(p2));
		System.out.println("p1和p2的hashcode是否一样"+(p1.hashCode()==p2.hashCode()));
		/**
		 * 当我们重写了Point和equals和hashcode方法后发现：
		 * 虽然p1和p2是两个对象，但是当我们将他们同时放入集合时，
		 * p2对象并没有被添加进集合。因为p1在放入后，
		 * p2放入时根据p2的hashCode计算的位置相同，
		 * 且p2与该位置的p1的equals比较为true，
		 *  hashSet认为该对象已经存在，所以拒绝将p2存入集合
		 */
		set.add(p1);
		set.add(p2);
		System.out.println("元素数："+set.size());
		for (Point p : set) {
			System.out.println(p);
		}
		/**
		 * 重写    ：equals()
		 * 不重写 ：hashcode()
		 */
		Point1 p11 = new Point1(1,2);
		Point1 p12 = new Point1(1,2);
		Point1 p13 = new Point1(1,2);
		Set<Point1> set1 = new HashSet<Point1>();
		set1.add(p11);
		set1.add(p12);
		System.out.println("元素数："+set1.size());
		System.out.println(set1.contains(p11));
		System.out.println(set1.contains(p13));
		System.out.println(set1);
		/**
		 * 重写：hashcode()
		 * 不重写：equals()
		 */
		Point2 p21 = new Point2(1,2);
		Point2 p22 = new Point2(1,2);
		Point2 p23 = new Point2(1,2);
		Set<Point2> set2 = new HashSet<Point2>();
		set2.add(p21);
		set2.add(p22);
		System.out.println("元素数："+set2.size());
		System.out.println(set2.contains(p21));
		System.out.println(set2.contains(p23));
		System.out.println(set2);
	}
}
