package com.jiangnan.resource;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-resource.xml");
		OwnResource ownResource =  (OwnResource) context.getBean("resource");
		ownResource.getReource();
	}

}
