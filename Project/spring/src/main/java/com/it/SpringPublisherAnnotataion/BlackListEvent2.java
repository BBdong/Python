package com.it.SpringPublisherAnnotataion;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent2 extends ApplicationEvent {
	
	private final String address;
    private final String content;
	
	public BlackListEvent2(Object source, String address, String content) {
		super(source);
		this.address = address;
        this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public String getContent() {
		return content;
	}
    
}
