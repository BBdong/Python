package com.it.Springeventobservable;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener implements ApplicationListener<MySpringEvent> {
	public void onApplicationEvent(MySpringEvent event) {
		System.out.println("自定义springListener===============！！！！");
		
	}
	
}
