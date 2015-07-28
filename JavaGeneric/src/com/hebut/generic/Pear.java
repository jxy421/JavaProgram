package com.hebut.generic;

public class Pear<E,T> extends Fruit<E>{
	private T version;

	@Override
	public E getInfo() {
		return super.getInfo();
	}

	@Override
	public void setInfo(E info) {
		super.setInfo(info);
	}

	public T getVersion() {
		return version;
	}

	public void setVersion(T version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Pear [version=" + version + "]";
	}
	
	
}
