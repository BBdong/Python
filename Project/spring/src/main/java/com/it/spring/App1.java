package com.it.spring;


import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.it.springinterface.App;

@Repository
public class App1 {
	
	
	
	@Inject
	private App app2;
		
	
	
	public void app1() {
		app2.aap2();
		
		System.out.println("--------------------");
	}
	
}
