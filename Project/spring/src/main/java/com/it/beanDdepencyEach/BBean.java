package com.it.beanDdepencyEach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BBean {
	
	@Autowired
	ABean aBean; 
	
	BBean() {
		System.out.println("BBean init...");
	}
}
