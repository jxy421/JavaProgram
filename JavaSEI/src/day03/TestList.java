package day03;

import java.util.ArrayList;
/**
 * List����
 * 1. Lsit��һ���ӿڲ���ʵ����
 * 2. ArrayList  ���Ա�
 * 3. LinkedList ����
 * @author sunddenly
 *
 */
public class TestList {
	public static void main(String[] args) {
		/**
		 * ����һ��ArrayListʵ��
		 * List��ArrayList������java.util����
		 * 1.���迼������������Ԫ���Զ�����
		 * 2.Ԫ�ص����������������Ԫ��������
		 */
		/*
		 * add������add(Object obj)
		 * 1.���Է��������͵�Ԫ�أ���Ϊadd�Ĳ�����Object����
		 * 2.�����򼯺��д�Ŷ������ͣ���Ϊȡ��ʱ����鷳
		 */
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		list.add(1);
		/**
		 * ArrayList��д��toString()����
		 * ���ص��ǣ�ArrayListԪ�ص�toString()����
		 */
		System.out.println("Ԫ��������"+list.size());
		System.out.println("Ԫ�����ݣ�"+list);
		
		//��ռ���
		list.clear();
		System.out.println("Ԫ��������"+list.size());
		System.out.println("�����ǿ���"+list.isEmpty());

		
	}
}
