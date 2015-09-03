package com.jiangnan.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class OwnResource implements ApplicationContextAware{
	
	private ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
	
	public void getReource() throws IOException{
		//Resource resource = applicationContext.getResource("classpath:file/config.txt");
		//Resource resource = applicationContext.getResource("file/config.txt");
		Resource resource = applicationContext.getResource("http://docs.spring.io/spring/docs/current/spring-framework-reference/pdf/spring-framework-reference.pdf");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
