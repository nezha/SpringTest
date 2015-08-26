package com.jiangnan.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MoocApplicationContext implements ApplicationContextAware  {

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MoocApplicationContext :" + applicationContext.getBean("moocApplicationContext").hashCode());
	}
	
//	public void setApplicationContext(ApplicationContext applicationContext)
//			throws BeansException {
//		System.out.println("MoocApplicationContext : " + applicationContext.getBean("moocApplicationContext").hashCode());
//	}
	
}
