package com.jiangnan.beanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiangnan.test.base.UnitTestBase;


public class Main extends UnitTestBase{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beanannotation.xml");
		BeanAnnotation beanAnnotation = (BeanAnnotation)context.getBean("bean");
		beanAnnotation.myHashCode();
		beanAnnotation = (BeanAnnotation)context.getBean("bean");
		beanAnnotation.myHashCode();
		
	}

}
