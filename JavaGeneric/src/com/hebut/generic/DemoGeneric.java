package com.hebut.generic;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("Jerry");
		list.add("Jerry");
		//list.add(new Integer(1));//±àÒë´íÎó
		System.out.println(list);
	}
}
