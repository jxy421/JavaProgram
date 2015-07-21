package day03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * List中的其他方法
 * @author sunddenly
 *
 */
public class TestList5 {
	public static void main(String[] args) {
		/**
		 * List中也有类似String的IndexOf，LastIndexOf
		 */
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		//下标从0开始
		System.out.println(list.indexOf("three"));
		System.out.println(list.lastIndexOf("one"));
		/**
		 * 将集合转换为数组
		 * 1. Object[] toArray()
		 * 2. 该方法会将集合以对象数组的形式返回
		 */
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		
	}
}
