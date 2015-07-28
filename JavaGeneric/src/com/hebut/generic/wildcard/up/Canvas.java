package com.hebut.generic.wildcard.up;

import java.util.List;

/**
 * 定义一个画布
 * @author sunddenly
 */
public class Canvas {
	//同时在画布上绘制绘制多个形状
	public void drawAll(List<? extends Shape> shapes){
		for (Shape shape : shapes) {
			shape.draw(this);
		}
	}
}
