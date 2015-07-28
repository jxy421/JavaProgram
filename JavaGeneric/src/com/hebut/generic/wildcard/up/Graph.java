package com.hebut.generic.wildcard.up;

import java.io.Serializable;

public class Graph<T extends Shape&Serializable> {
	Graph<Circle> gc = new Graph<>();
	Graph<Rectangle> gr = new Graph<>();
//	Graph<String> gs = new Graph<>();//编译错误String不是Shape的子类
}

