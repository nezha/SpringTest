package com.jiangnan.bean;

public class BeanScope {
	public String name;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void say() {
		System.out.println("BeanScope say : My name is "+name + this.hashCode());
	}
	
}
