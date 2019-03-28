package com.it.SpringPublisherAnnotataion;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

public class BlackListEvent extends ApplicationEvent {
	
	private final String address;
    private final String content;
	
	public BlackListEvent(Object source, String address, String content) {
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
