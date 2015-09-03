package com.jiangnan.test.resource;


import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jiangnan.resource.OwnResource;
import com.jiangnan.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {
	
	public TestResource() {
		super("classpath:spring-resource.xml");
	}
	
	@Test
	public void testResource() throws IOException {
		OwnResource ownResource = super.getBean("resource");
		ownResource.getReource();
	}
	
}
