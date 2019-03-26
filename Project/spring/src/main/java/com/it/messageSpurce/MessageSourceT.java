package com.it.messageSpurce;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.TEST.SpringContext;

public class MessageSourceT {
	
	public static void main(String[] args) {
		
		
		MessageSource context = new AnnotationConfigApplicationContext(SpringContext.class);
		//ResourceBundleMessageSource messageSource =  context.getBean(ResourceBundleMessageSource.class);
		String c= context.getMessage("message", new Object[] {"666","777","88"}, "Default", Locale.CHINESE);
		String u= context.getMessage("message", new Object[] {"11","222"}, "Default", Locale.US);
		System.out.println(c);
		System.out.println(u);	
	}
}
