package day03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator ���Ա��������е�Ԫ��
 * ������
 * 		1. ����Collection��ʵ���඼ʵ����iterator����
 * 		2. �÷�������һ��Iterator�ӿ����Ͷ���
 * Itertor�ӿڷ���
 * 		1. boolean hasnext()�ж�ָ������Ƿ���Ԫ��
 * 		2. E next() ָ����Ʒ��ص�ǰԪ��
 * 		3. void remove()��ԭ������ɾ���ոշ���Ԫ��
 * @author sunddenly
 *
 */
public class TestIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("One");
		list.add("#");
		list.add("Two");
		list.add("#");
		list.add("Three");
		list.add("#");
		Iterator it = list.iterator();
		/*
		 * ��������ʹ��
		 * 1. hasnext(),next()
		 * 2. ���������У����ǲ��ܹ�ͨ�����Ͻ�����ɾ�Ĳ�
		 * 3. Ҫɾ����ʹ��iterator
		 * 4. remove�������Խ��ոջ�ȡ��Ԫ��ɾ��������ǰnext()ָ���Ԫ��
		 * 5. ɾ���������ܹ�����������
		 */
		while(it.hasNext()){
			String ele = (String) it.next();
			if("#".equals(ele)){
				//list.remove(ele);������
				it.remove();//ɾ����ǰԪ��
			}
			System.out.println(ele);
		}
		System.out.println(list);
	}
}
