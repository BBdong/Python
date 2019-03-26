package com.it.Observer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

public class T1 {
	
	public static void main(String[] args) {
		
		
		UserInfo user1 = new UserInfo();
		UserInfo user2 = new UserInfo();
		user1.setName("小明");
		user2.setName("小hong");
		List< UserInfoListener> list = new ArrayList<UserInfoListener>();
		list.add(user1);
		list.add(user2);
		
		Login l = new Login(list);
		Event e = new Event();
		e.setFlag("1");
		l.push(e);
		
		//ApplicationContext
		
	}

}


