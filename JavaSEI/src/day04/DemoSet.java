package day04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set���� �����Ҳ��ظ�����
 * ����ʵ����
 * 			HashSet��ʹ��ɢ���㷨ʵ�ֵ�Set����
 * @author sunddenly
 *
 */
public class DemoSet {
	public static void main(String[] args) {
		/*
		 * ʵ����һ��HashSet����
		 */
		Set<String> set = new HashSet<String>();
		/*
		 * �򼯺������Ԫ��
		 * add()
		 * ��Ϊ���򣬵���add()���������򼯺�β��׷��Ԫ��
		 */
		set.add("One");
		set.add("Two");
		set.add("Three");
		/*
		 * û��get(int index)����
		 * ���Բ��ܸ����±��ȡԪ��
		 * ������Ҫʹ��Iterator/foreach
		 */
		/**
		 * ����Hash���˳��ͷ���˳��һ��
		 * Hashset��set��ʵ���࣬ͨ��hash��ķ�ʽʵ��
		 * �ڽ��������HashSetʱ����Ҫ��ȡ�����hashcodeֵ
		 * ͨ��hash�㷨��������Ӧ�Ĵ洢�ռ�
		 * �ô�����Ч�Ĳ�ѯ
		 * ��ɫ����Ԫ�غʹ洢λ�ù�������
		 * find(key)ʱ��HashSet()����
		 * find(index)ʱ��list/array������
		 */
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		/**
		 * 
		 */

//		for (String string : set) {
//			System.out.print(string+" ");
//		}
		
	}
}
