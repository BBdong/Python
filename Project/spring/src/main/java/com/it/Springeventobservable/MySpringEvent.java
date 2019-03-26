package com.it.Springeventobservable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

@Component
public class MySpringEvent extends ApplicationContextEvent {
	
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public MySpringEvent(ApplicationContext source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
}
