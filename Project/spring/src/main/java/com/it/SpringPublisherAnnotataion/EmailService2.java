package com.it.SpringPublisherAnnotataion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class EmailService2  implements EmailServiceIterface{
	
	public EmailService2() {
		System.out.println(">>>>>>>>>>EmailService2");
	}
	
	private List<String> blackList = new ArrayList<>();
	
	public void addBlackList(String blackList) {
		this.blackList.add(blackList);
	}
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void publisher2(String address,String content) {
		if(this.blackList.contains(address)) {
			applicationEventPublisher.publishEvent(new BlackListEvent2(this,address, content));
			System.out.println(">>>>>>>>>>>>>>>>>>>>>=======");
		}
	}
	
}
