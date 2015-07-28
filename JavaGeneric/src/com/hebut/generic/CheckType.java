package com.hebut.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 检查类型的测试
 * @author sunddenly
 *
 */
public class CheckType {
	public static void main(String[] args) {
		StrList list = new StrList();
		list.add("Tom");
		list.add("Jerry");
		list.add("Joney");
		//list.add(Integer.valueOf(1));//编译错误类型不匹配
		System.out.println(list);
	}
}
