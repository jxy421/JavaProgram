package io.de_serialize;

import java.io.Serializable;
import java.util.List;

/**
 * 每一个实例描述一个人的信息
 * @author sundeenly
 *
 */
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID =1L;
	private int v=0;
	private String name;
	private int age;
	private int phoneNumber;
	private int sex;
	private List<String> otherInfo;
	public Person(String name, int age, int phoneNumber, int sex,
			List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.sex = sex;
		this.otherInfo = otherInfo;
		v=1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public List<String> getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phoneNumber="
				+ phoneNumber + ", sex=" + sex + ", otherInfo=" + otherInfo+"]";
	}
}
