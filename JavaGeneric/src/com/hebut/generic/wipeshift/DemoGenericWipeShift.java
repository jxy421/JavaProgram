package com.hebut.generic.wipeshift;
/**
 * ���Է��Ͳ���ת��
 * @author sunddenly
 * 
 */
public class DemoGenericWipeShift {
	public static void main(String[] args) {
		Foo<Integer> f1 = new Foo<>();
		//f1��getSize()��������Integer����
		Integer size1 = f1.getSize();
		//��f1����f2����ʧ���������������Ϣ
		Foo f2 = f1;
		//f2ֻ֪��size��������Number
		Number size2 = f2.getSize();
		//����Ĵ��뽫������������
//		Integer size3 = f2.getSize();
	}
}
class Foo<T extends Number>{
	T size;
	public Foo(T size) {
		this.size = size;
	}
	public Foo() {
	}
	public T getSize() {
		return size;
	}
	public void setSize(T size) {
		this.size = size;
	}
}