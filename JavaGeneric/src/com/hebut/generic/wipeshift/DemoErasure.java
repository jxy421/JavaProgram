package com.hebut.generic.wipeshift;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型擦出转换测试
 * @author sunddenly
 *
 */
public class DemoErasure {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		List li = list;
		//下面代码有“未经检查的转换”警告，在编译、运行时候正常
		List<String> ls =li;
		//只要访问ls里的元素就回出现运行异常
		System.out.println(ls.get(0));
	}
}
