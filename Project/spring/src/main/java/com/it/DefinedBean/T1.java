package com.it.DefinedBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class T1 {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestBean.class);
		
		TestBean testBean = context.getBean(TestBean.class);
		System.out.println(">>>>>>>>>>>>>>"+testBean);
	
		
		
	}
}
