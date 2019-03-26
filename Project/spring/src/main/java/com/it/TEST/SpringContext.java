package com.it.TEST;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

import com.it.spring.T1;

@Configuration
@ComponentScan(value="com.it")
@EnableAspectJAutoProxy
@EnableAsync
public class SpringContext {
	
		
	@Bean("aa")
	public T1 getT1() {
		return new T1();
	}
	
	@Bean("messageSource")
	public MessageSource getResourceBundleMessageSource() {
		ResourceBundleMessageSource messsageReource =  new ResourceBundleMessageSource();
		messsageReource.setDefaultEncoding(StandardCharsets.UTF_8.name());
		messsageReource.setBasenames("message");
		return messsageReource;
	}
	
}
