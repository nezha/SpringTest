package com.jiangnan.beanannotation.beanconfig;


public class MyStore implements Store {

	public void init() {
		System.out.println("This is init.");
	}
	
	public void destroy() {
		System.out.println("This is destroy.");
	}
	
}
