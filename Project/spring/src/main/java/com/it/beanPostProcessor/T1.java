package com.it.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Spring 的后置处理器  BeanPostProcessor
 * 
 * @author mayadong[863836234@qq.com]
 *
 */
public class T1 {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ApplcationConfig.class);
		IndexBean indexBean = c.getBean(IndexBean.class);
		System.out.println(indexBean);
		
		
		
	}
}
