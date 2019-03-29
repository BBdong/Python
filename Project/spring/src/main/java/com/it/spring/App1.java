package com.it.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class App1 {
	
	@Autowired
	private App2 App2;
	
	
	public void app1() {
		System.out.println("--------------------");
	}
	
}
