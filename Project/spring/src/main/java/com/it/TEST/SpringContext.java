package com.it.TEST;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan(value="com.it")
@EnableAspectJAutoProxy
@EnableAsync
public class SpringContext {
	
	
	
}
