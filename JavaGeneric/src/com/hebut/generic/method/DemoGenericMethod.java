package com.hebut.generic.method;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ͷ�������
 * @author sunddenly
 *
 */
public class DemoGenericMethod {
	
	/**
	 * ���鸴�Ƶ�����
	 * @param arys
	 * @param collects
	 */
	
	static <T> void FromArrayToCollecton(T[] arys,Collection<T> collects){
		for (T t : arys) {
			collects.add(t);
		}
	}
	
	/**
	 * ���ϼ�ĸ���1
	 * @param from
	 * @param to
	 */
	static <T> void CopyToCollection1(Collection<T> from,Collection<T> to){
		for (T ele : from) {
			to.add(ele);
		}
	}
	static <T> void CopyToCollection2(Collection<? extends T> from,Collection<T> to){
		for (T ele : from) {
			to.add(ele);
		}
	}
	public static void main(String[] args) {
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		
		Integer[] ia = new Integer[100];
		Collection<Integer> ci = new ArrayList<>();
		
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<Number>();
		
		FromArrayToCollecton(oa, co);
		FromArrayToCollecton(ia, co);
		FromArrayToCollecton(na, co);
		FromArrayToCollecton(sa, co);
		FromArrayToCollecton(na, co);
		
		FromArrayToCollecton(ia, ci);
		FromArrayToCollecton(na, cn);
		FromArrayToCollecton(sa, cs);
//		FromArrayToCollecton(na, cs);//�������
//		FromArrayToCollecton(ia, cs);//�������
		
		CopyToCollection1(ci, ci);//����ķ��Ͳ�������һ��
		CopyToCollection2(ci, cn);//����ĵ�һ�����Ͳ����ǵڶ���������
	}
}

