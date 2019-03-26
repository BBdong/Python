package com.it.beanDdepencyEach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.TEST.SpringContext;

/**
 * 测试  两个bean之间相互依赖的问题
 *				   
 * @author mayadong
 * @date 2019年3月1日 - 上午10:30:18
 */
public class T {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringContext.class);
		applicationContext.getBean(ABean.class);
		//
		
	}
	
}
