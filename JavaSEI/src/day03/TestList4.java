package day03;

import java.util.ArrayList;

/**
 * ListԪ���޸��ڲ�ѯ
 * @author hdoop
 *
 */
public class TestList4 {
	public static void main(String[] args) {
		/**
		 * ��ȡԪ��
		 * get(index)
		 * �����±��ȡԪ��
		 */
		ArrayList list1 = new ArrayList();
		list1.add("one");
		list1.add("two");
		list1.add("Three");
		String ele=(String)list1.get(2);
		System.out.println(ele);
		//���ϱ���
//		for(int i=0;i<list1.size();i++){
//			System.out.println(list1.get(i));
//		}
//		for (Object object : list1) {
//			System.out.println(object);
//		}
		/**
		 * �޸�/�滻����Ԫ��
		 * Object set(int index,Object newElement)
		 * 1. ��indexλ�õ�Ԫ���޸�ΪnewElement
		 * 2. �޸ĺ��Ԫ�ػᱻ����
		 */
		Object old = list1.set(2, "��");
		System.out.println("���滻Ԫ�أ�"+old);
		System.out.println(list1);
		/**
		 * ���뼯��Ԫ��
		 * add(int index,Object new Element)
		 * 1. add�����ط���
		 * 2. ��indexָ��λ�ò���newElement
		 * 3. ԭλ��Ԫ�غ����
		 * 4. ��ν���
		 * 0    1    2
		 * one two  three
		 */
		list1.add(2,"��");
		System.out.println(list1);
		/**
		 * �����±�ɾ��Ԫ��
		 * Object remove(int index)
		 * 1. ���������±�Ϊindex��Ԫ��ɾ��
		 * 2. ����ɾ��Ԫ��
		 * boolean remove(Object obj)
		 * 1. remove�����ط���
		 * 2. �Ż��Ƿ�ɾ��
		 */
		Object obj=list1.remove(1);
		System.out.println("��ɾ��Ԫ�أ�"+obj);
		System.out.println(list1);
	}
}
