package com.hebut.generic.wildcard.up;

import java.io.Serializable;

/**
 * ����һ��Shape������Circle
 * @author sunddenly
 */
public class Circle extends Shape implements Serializable{
	//ʵ�ֻ�ͼ�������Դ�ӡ�ַ�����ģ�⻭ͼ����
	@Override
	public void draw(Canvas c) {
		System.out.println("�ڻ���"+c+"�ϻ�һ��Բ��");
	}
}
