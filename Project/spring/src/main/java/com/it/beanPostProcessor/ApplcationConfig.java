package com.it.beanPostProcessor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "com.it")
@EnableAspectJAutoProxy
public class ApplcationConfig {
	
}
