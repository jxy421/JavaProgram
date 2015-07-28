package com.hebut.generic;

import java.util.ArrayList;

/**
 * 自定义一个编译检查类型的List
 * List<String>
 * @author sunddenly
 *
 */
public class StrList {
	ArrayList strList = new ArrayList();
	public boolean add(String ele){
		return strList.add(ele);
	}
	public String get(int index){
		return (String) strList.get(index);
	}
	public int size(){
		return strList.size();
	}
	public String toString(){
		return strList.toString();
	}
}
