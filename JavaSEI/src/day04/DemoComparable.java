package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections
 * 测试集合工具类 对集合元素进行的自然排序
 * 要确保集合中的元素是Comparable的子类
 * @author sunddenly
 *
 */
public class DemoComparable {
	public static void main(String[] args) {
		List<ComparablePoint> list=new ArrayList<ComparablePoint>();
		//向集合中存放3个对象
		list.add(new ComparablePoint(1,2));
		list.add(new ComparablePoint(3,4));
		list.add(new ComparablePoint(0,5));
		System.out.println(list);
		/**
		 * 使用集合工具类对集合进行自然排序
		 * 该方法会依次调用集合中的每个元素的CompareTo()方法进行比较
		 */
		Collections.sort(list);
		System.out.println(list);
		/**
		 * 当前的排序规则已定
		 * 集合外界的比较规则
		 * 并不是集合元素本身的比较规则，集合元素本的比较规则不能随便改
		 * 想通过其他方式进行排序Comparator(E o1,E o2)
		 * 该方法返回值大于0：o1>o2
		 * 该方法返回值等于0：o1=o2
		 * 该方法返回值小于0：o1<o2
		 * 应用：用于比较集合中的元素
		 * 		Collections提供了sort的重载方法，支持传入一个比较器对集合进行比较
		 */
		/**
		 * 排序集合元素时，我们不想根据 元素的比较规则 来进行排序
		 * 根据x值进行比较
		 * 自定义的比较规则实现步骤如下：
		 * 		1. 定义一个类并实现Comparator接口
		 * 		2. 实现接口中的抽象方法CompareTo(E o1,E o2)
		 *      3. 实例化这个比较器
		 *      4. 调用collections的重载方法
		 *         sort(Collections,Comparator comparator)
		 *      5. 使用匿名内部类方式创建一个比较器
		 */
		Comparator c=new Comparator<ComparablePoint>(){
			/**
			 * 自定义比较规则
			 * @param o1
			 * @param o2
			 * @return 大于0：o1>o2
			 *         等于0：o1=o2
			 *         小于0：o1<o2
			 */
			@Override
			public int compare(ComparablePoint o1, ComparablePoint o2) {
				//两个点Y值大的大
				return o2.getX()-o1.getX();
			}
		};
		Collections.sort(list,c);
		System.out.println(list);
	}

}
