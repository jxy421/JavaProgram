package com.hebut.generic.wildcard.up;

import java.util.List;

/**
 * ����һ������
 * @author sunddenly
 */
public class Canvas {
	//ͬʱ�ڻ����ϻ��ƻ��ƶ����״
	public void drawAll(List<? extends Shape> shapes){
		for (Shape shape : shapes) {
			shape.draw(this);
		}
	}
}
