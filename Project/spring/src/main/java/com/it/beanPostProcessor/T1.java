package com.it.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 的后置处理器  BeanPostProcessor
 * 
 * 通过在后置处理器 扩展类  ，实现代理的功能  模仿Spring 代理和IOC容器整合 
 * 
 * @author mayadong[863836234@qq.com]
 *
 */
public class T1 {
	public static void main(String[] args) {
		/*IndexBean indexBean = new IndexBean();
		Proxy proxy = new Proxy(indexBean);  //使用注解了  ， 不使用注解应从写构造器 或 set 方法
		Object obj = java.lang.reflect.Proxy.newProxyInstance(T1.class.getClassLoader(), IndexBean.class.getInterfaces(), proxy);
		InterFaceBean bean =  (InterFaceBean)obj;
		bean.a();*/
		
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ApplcationConfig.class);
		//IndexBean indexBean = c.getBean(IndexBean.class);
		//System.out.println(indexBean);
		//indexBean.a();
		
	}
}
