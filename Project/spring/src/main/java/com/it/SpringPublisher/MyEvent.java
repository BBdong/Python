package com.it.SpringPublisher;

import org.springframework.context.ApplicationEvent;

public class MyEvent  {

	private boolean flage;
	
	public boolean isFlage() {
		return flage;
	}
	

	public void setFlage(boolean flage) {
		this.flage = flage;
	}

}
