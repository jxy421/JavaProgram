package com.hebut.generic;

public class Orange extends Fruit{
	//super.getInfo()���ص���Object����
	public String getInfo(){
		return (String) super.getInfo();
	}
	public void setInfo(String ele){
		super.setInfo(ele);
	}
}
