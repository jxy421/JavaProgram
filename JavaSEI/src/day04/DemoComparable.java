package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections
 * ���Լ��Ϲ����� �Լ���Ԫ�ؽ��е���Ȼ����
 * Ҫȷ�������е�Ԫ����Comparable������
 * @author sunddenly
 *
 */
public class DemoComparable {
	public static void main(String[] args) {
		List<ComparablePoint> list=new ArrayList<ComparablePoint>();
		//�򼯺��д��3������
		list.add(new ComparablePoint(1,2));
		list.add(new ComparablePoint(3,4));
		list.add(new ComparablePoint(0,5));
		System.out.println(list);
		/**
		 * ʹ�ü��Ϲ�����Լ��Ͻ�����Ȼ����
		 * �÷��������ε��ü����е�ÿ��Ԫ�ص�CompareTo()�������бȽ�
		 */
		Collections.sort(list);
		System.out.println(list);
		/**
		 * ��ǰ����������Ѷ�
		 * �������ıȽϹ���
		 * �����Ǽ���Ԫ�ر���ıȽϹ��򣬼���Ԫ�ر��ıȽϹ���������
		 * ��ͨ��������ʽ��������Comparator(E o1,E o2)
		 * �÷�������ֵ����0��o1>o2
		 * �÷�������ֵ����0��o1=o2
		 * �÷�������ֵС��0��o1<o2
		 * Ӧ�ã����ڱȽϼ����е�Ԫ��
		 * 		Collections�ṩ��sort�����ط�����֧�ִ���һ���Ƚ����Լ��Ͻ��бȽ�
		 */
		/**
		 * ���򼯺�Ԫ��ʱ�����ǲ������ Ԫ�صıȽϹ��� ����������
		 * ����xֵ���бȽ�
		 * �Զ���ıȽϹ���ʵ�ֲ������£�
		 * 		1. ����һ���ಢʵ��Comparator�ӿ�
		 * 		2. ʵ�ֽӿ��еĳ��󷽷�CompareTo(E o1,E o2)
		 *      3. ʵ��������Ƚ���
		 *      4. ����collections�����ط���
		 *         sort(Collections,Comparator comparator)
		 *      5. ʹ�������ڲ��෽ʽ����һ���Ƚ���
		 */
		Comparator c=new Comparator<ComparablePoint>(){
			/**
			 * �Զ���ȽϹ���
			 * @param o1
			 * @param o2
			 * @return ����0��o1>o2
			 *         ����0��o1=o2
			 *         С��0��o1<o2
			 */
			@Override
			public int compare(ComparablePoint o1, ComparablePoint o2) {
				//������Yֵ��Ĵ�
				return o2.getX()-o1.getX();
			}
		};
		Collections.sort(list,c);
		System.out.println(list);
	}

}
