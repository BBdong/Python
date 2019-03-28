package com.it.SpringPublisherAnnotataion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(value = 2)
public class EmailService implements EmailServiceIterface {
	
	public EmailService() {
		System.out.println(">>>>>>>>>>EmailService");
	}
	
	private List<String> blackList = new ArrayList<>();
	
	public void addBlackList(String blackList) {
		this.blackList.add(blackList);
	}
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void publisher(String address,String content) {
		if(this.blackList.contains(address)) {
			applicationEventPublisher.publishEvent(new BlackListEvent(this,address, content));
			System.out.println(">>>>>>>>>>>>>>>>>>>>>=======");
		}
	}
	
}
