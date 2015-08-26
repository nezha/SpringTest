package com.jiangnan.test.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiangnan.lifecycle.BeanLifeCycle;
import com.jiangnan.test.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifecycle extends UnitTestBase{
	public TestBeanLifecycle() {
		// TODO Auto-generated constructor stub
		super("classpath:spring-lifecycle.xml");
	}
	@Test
	public void test() {
		super.getBean("beanLifeCycle");
		
	}
	
}
