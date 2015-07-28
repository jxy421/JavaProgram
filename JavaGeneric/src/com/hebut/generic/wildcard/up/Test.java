package com.hebut.generic.wildcard.up;

import java.util.ArrayList;
import java.util.List;

/**
 * ª≠Õº≤‚ ‘¿‡
 * @author sunddenly
 */
public class Test {
	public static void main(String[] args) {
		Canvas cas = new Canvas();
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		
		List<Circle> circleList = new ArrayList<Circle>();
		List<Rectangle> rectList = new ArrayList<Rectangle>();
		
		circleList.add(new Circle());
		rectList.add(new Rectangle());
		cas.drawAll(circleList);
		cas.drawAll(rectList);
		
		List<? extends Shape> shapes = new ArrayList<Circle>();
		//shapes.add(new Circle());
	}
}
