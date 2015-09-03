package com.jiangnan.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-autowiring.xml");
		AutoWiringService autoWiringService = (AutoWiringService) context.getBean("autoWiringService");
		autoWiringService.say("你好");
	}

}
