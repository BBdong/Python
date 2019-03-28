package com.it.SpringPublisherAnnotataion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.TEST.SpringContext;
/**
 * 基于注解的方式实现 spring 的异步时间推送
 * @Description
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019年2月28日 - 下午3:03:59
 */
public class AnnotationT {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class); 
		EmailService emailService = context.getBean(EmailService.class);
		EmailService2 emailService2 = context.getBean(EmailService2.class);
		emailService.addBlackList("11");
		//emailService2.addBlackList("222");
		emailService.publisher("11", "我我我我");
		//emailService2.publisher2("222", "你你你");
		//ContextLoaderListener
	}
	
}
