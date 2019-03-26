package com.it.beanDdepencyEach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ABean {
	
	
	@Autowired
	BBean bBean;
	
	/*@PostConstruct
	public void a () {
		System.out.println("---1");
	}
	
	@PreDestroy
	public void b () {
		System.out.println("---2");
	}*/

	/*ABean() {
		System.out.println("ABean init...构造器-----2");
	}*/
	
}
