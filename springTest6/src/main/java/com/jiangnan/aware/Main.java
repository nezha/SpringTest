package com.jiangnan.aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aware.xml");
		System.out.println("testBeanName : " + context.getBean("moocBeanName").hashCode());
		context.start();
		context.destroy();
	}

}
