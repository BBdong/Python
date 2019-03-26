package com.it.Springeventobservable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Server {
	
	@Autowired
	private ApplicationContext applicationContext; 
	

	
	public void push() {
		MySpringEvent MySpringEvent = new MySpringEvent(applicationContext);
		applicationContext.publishEvent(MySpringEvent);
	} 
	
}
