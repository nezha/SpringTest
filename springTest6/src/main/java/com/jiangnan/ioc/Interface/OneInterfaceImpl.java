package com.jiangnan.ioc.Interface;

public class OneInterfaceImpl implements OneInterface {
	
	public void say(String arg) {
		System.out.println("ServiceImpl say: " + arg);
	}

}
