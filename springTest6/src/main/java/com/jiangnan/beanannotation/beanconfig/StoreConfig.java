package com.jiangnan.beanannotation.beanconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

	@Value("${url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Bean
	public MyDriverManager myDriverManager(){
		return new MyDriverManager(url, username, password);
	}
	
//	@Bean(initMethod = "init",destroyMethod = "destroy")
//	@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
//	public Store myStore(){
//		return new MyStore();
//	}
}
