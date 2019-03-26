package com.it.SpringPublisher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.TEST.SpringContext;

public class TListener {
	
	public static void main(String[] args) {
		
		System.out.println("====================开始启动！");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		System.out.println("====================容器启动完毕！");
		SpringServer1 server =  context.getBean(SpringServer1.class);
		server.push();
	}

}
