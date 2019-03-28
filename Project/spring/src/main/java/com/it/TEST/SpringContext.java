package com.it.TEST;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

import BeanFactoryAndFactoryBean.T1;

import org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
@ComponentScan(value="com.it")
@EnableAspectJAutoProxy
@EnableAsync
public class SpringContext {
	
	
	@Bean("aa")
	public T1 getT1() {
		return new T1();
	}
	
	
}
