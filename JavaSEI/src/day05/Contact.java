package day05;

import java.util.*;

/**
 * 联系人信息
 * @author sunddenly
 * 
 *
 */
public class Contact {
	/**
	 * 定义一个Map类型的属性
	 * 该属性可以存放自定义的属性内容
	 */
	Map<String,String> fields =new HashMap<String,String>();
	
	/**
	 * 设置属性方法
	 * @param field 属性名
	 * @param value 属性内容
	 */
	public void set(String field,String value){
		fields.put(field, value);
	}
	/**
	 * 获取联系人信息
	 * @param field 属性名
	 * @return      对应的属性内容
	 */
	public String get(String field){
		return fields.get(field);
	}
	/**
	 * 将HashMap的toString()作为联系人的toString()返回
	 */
	@Override
	public String toString() {
		return fields.toString();
	}
	
	
}
