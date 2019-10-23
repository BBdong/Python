package com.it.SpringPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringServer1 {
	private SpringServer1() {
		// TODO Auto-generated method stub
		System.out.println("SpringServer1 init...");
	}
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void  push() {
		//创建事件
		MyEvent e = new MyEvent();
		e.setFlage(true);
		//发布事件，然后触发监听
		eventPublisher.publishEvent(e);

	}
	
}
