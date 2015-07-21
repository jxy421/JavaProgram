package day04;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试hashcode对HashSet的影响
 * @author sunddenly
 *
 */
public class DemoHashSet {
	public static void main(String[] args) {
		Set<Point> set = new HashSet<Point>();
		set.add(new Point(1,2));
		set.add(new Point(3,4));
		System.out.println(set);
		/**
		 * 查看新创建的对象是否在Set中包含
		 * 虽然是新创建的对象，但是通过  散列算法找到位置  后
		 * 和里面的元素进行equals比较true，所以依然被包含的
		 * 所以：
		 * 		contains操作并不是全遍历来判断是否
		 * 		而是通过hashcode直接索引集合中相同元素的位置
		 * 		所以速度非常快，就是说：
		 * 		不同的对象，如果内容一样，经过hash计算hashcode
		 *      可以相同
		 * 		
		 */
		/*
		 * 若我们不重写hashcode，那么使用的是Object提供的
		 * 该方法，返回值是句柄，不同对象hashcode不同
		 */
		System.out.println(set.contains(new Point(1,2)));
	}
}
