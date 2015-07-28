package com.hebut.generic;

public class Orange extends Fruit{
	//super.getInfo()返回的是Object类型
	public String getInfo(){
		return (String) super.getInfo();
	}
	public void setInfo(String ele){
		super.setInfo(ele);
	}
}
