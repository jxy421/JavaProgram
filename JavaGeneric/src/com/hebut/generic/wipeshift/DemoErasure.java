package com.hebut.generic.wipeshift;

import java.util.ArrayList;
import java.util.List;

/**
 * ���Ͳ���ת������
 * @author sunddenly
 *
 */
public class DemoErasure {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		List li = list;
		//��������С�δ������ת�������棬�ڱ��롢����ʱ������
		List<String> ls =li;
		//ֻҪ����ls���Ԫ�ؾͻس��������쳣
		System.out.println(ls.get(0));
	}
}
