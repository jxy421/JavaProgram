package com.hebut.generic.wildcard.up;

import java.io.Serializable;

/**
 * ����Shape������Rectangle
 * @author sunddenly
 */
public class Rectangle extends Shape implements Serializable{
	//ʵ�ֻ�ͼ�������Դ�ӡ�ַ�����ģ�⻭ͼ����
	@Override
	public void draw(Canvas c) {
		System.out.println("�ڻ���"+c+"��һ������");
	}
}
