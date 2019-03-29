package com.it.TEST;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.spring.App1;

public class T1 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		App1 app1 = (App1) context.getBean(App1.class);
		app1.app1();
	}
	


}
