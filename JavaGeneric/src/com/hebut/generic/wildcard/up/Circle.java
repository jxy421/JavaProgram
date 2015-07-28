package com.hebut.generic.wildcard.up;

import java.io.Serializable;

/**
 * 定义一个Shape的子类Circle
 * @author sunddenly
 */
public class Circle extends Shape implements Serializable{
	//实现画图方法，以打印字符串来模拟画图方法
	@Override
	public void draw(Canvas c) {
		System.out.println("在画布"+c+"上画一个圆！");
	}
}
