package day03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * List�е���������
 * @author sunddenly
 *
 */
public class TestList5 {
	public static void main(String[] args) {
		/**
		 * List��Ҳ������String��IndexOf��LastIndexOf
		 */
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		//�±��0��ʼ
		System.out.println(list.indexOf("three"));
		System.out.println(list.lastIndexOf("one"));
		/**
		 * ������ת��Ϊ����
		 * 1. Object[] toArray()
		 * 2. �÷����Ὣ�����Զ����������ʽ����
		 */
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		
	}
}
