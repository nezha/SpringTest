package com.jiangnan.lifecycle;

import org.springframework.beans.factory.InitializingBean;

public class ExampleInitializingBean implements InitializingBean {

	
	public void afterPropertiesSet() throws Exception {
		//do something
	}

}
