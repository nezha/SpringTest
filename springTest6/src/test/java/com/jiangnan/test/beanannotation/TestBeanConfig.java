package com.jiangnan.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jiangnan.beanannotation.beanconfig.MyDriverManager;
import com.jiangnan.beanannotation.beanconfig.MyStore;
import com.jiangnan.test.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanConfig extends UnitTestBase{
	public TestBeanConfig(){
		super("classpath:spring-beanannotation.xml");
	}
	
	
	@Test
	public void testBean(){
		MyStore myStore = super.getBean("myStore");
		System.out.println(myStore.getClass().getName());
	}
	
	@Test
	public void testproperties(){
		MyDriverManager myDriverManager = super.getBean("myDriverManager");
		System.out.println(myDriverManager.getClass().getName());
	}
}
