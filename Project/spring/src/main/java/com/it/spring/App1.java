package com.it.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.it.springinterface.App;

@Repository
public class App1 {
	
	
	
	@Autowired
	private App1 A;
		
	
	
	public void app1() {
		System.out.println("--------------------");
	}
	
}
