package com.hebut.generic;

public class Apple <E>{
	private E info;

	public Apple(){
		
	}
	public Apple(E info) {
		super();
		this.info = info;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Apple [info=" + info + "]";
	}
	public static void main(String[] args) {
		Apple<String> apple = new Apple<>("Æ»¹û");
		System.out.println(apple);
		Apple<Double> apple2 = new Apple<>(5.69);
		System.out.println(apple2);
	}
}
