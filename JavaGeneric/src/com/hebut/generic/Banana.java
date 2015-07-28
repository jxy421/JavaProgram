package com.hebut.generic;

public class Banana extends Fruit<String>{
	//正确重写了父类，返回值与父类Fruit<String>的返回值相同
	public String getInfo(){
		return super.getInfo();
	}
	//编译错误，重写方法时参数类型不一致
//	public void setInfo(Object obj){
//		
//	}
}
