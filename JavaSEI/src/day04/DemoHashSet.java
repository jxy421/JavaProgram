package day04;

import java.util.HashSet;
import java.util.Set;

/**
 * ����hashcode��HashSet��Ӱ��
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
		 * �鿴�´����Ķ����Ƿ���Set�а���
		 * ��Ȼ���´����Ķ��󣬵���ͨ��  ɢ���㷨�ҵ�λ��  ��
		 * �������Ԫ�ؽ���equals�Ƚ�true��������Ȼ��������
		 * ���ԣ�
		 * 		contains����������ȫ�������ж��Ƿ�
		 * 		����ͨ��hashcodeֱ��������������ͬԪ�ص�λ��
		 * 		�����ٶȷǳ��죬����˵��
		 * 		��ͬ�Ķ����������һ��������hash����hashcode
		 *      ������ͬ
		 * 		
		 */
		/*
		 * �����ǲ���дhashcode����ôʹ�õ���Object�ṩ��
		 * �÷���������ֵ�Ǿ������ͬ����hashcode��ͬ
		 */
		System.out.println(set.contains(new Point(1,2)));
	}
}
