package com.hebut.generic;

public class Fruit<E> {
	private E info;
	public Fruit(){
		
	}
	public Fruit(E info) {
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
		return "Fruit [info=" + info + "]";
	}
	
}
