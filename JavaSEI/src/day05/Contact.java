package day05;

import java.util.*;

/**
 * ��ϵ����Ϣ
 * @author sunddenly
 * 
 *
 */
public class Contact {
	/**
	 * ����һ��Map���͵�����
	 * �����Կ��Դ���Զ������������
	 */
	Map<String,String> fields =new HashMap<String,String>();
	
	/**
	 * �������Է���
	 * @param field ������
	 * @param value ��������
	 */
	public void set(String field,String value){
		fields.put(field, value);
	}
	/**
	 * ��ȡ��ϵ����Ϣ
	 * @param field ������
	 * @return      ��Ӧ����������
	 */
	public String get(String field){
		return fields.get(field);
	}
	/**
	 * ��HashMap��toString()��Ϊ��ϵ�˵�toString()����
	 */
	@Override
	public String toString() {
		return fields.toString();
	}
	
	
}
