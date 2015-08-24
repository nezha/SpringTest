package com.jiangnan.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiangnan.test.base.UnitTestBase;


public class Main extends UnitTestBase{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beanscope.xml");
		BeanScope beanScope = (BeanScope)context.getBean("beanScope");
		beanScope.say();
		
	}

}
