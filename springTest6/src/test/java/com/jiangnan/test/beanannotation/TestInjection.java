package com.jiangnan.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jiangnan.beanannotation.injection.service.InjectionService;
import com.jiangnan.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
	
	public TestInjection() {
		super("classpath:spring-beanannotation.xml");
	}
	
	@Test
	public void testAutowired() {
		InjectionService service = super.getBean("injectionServiceImpl");
		service.save("This is autowired.");
	}
	
	
}
