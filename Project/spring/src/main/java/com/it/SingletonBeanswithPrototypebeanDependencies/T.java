package com.it.SingletonBeanswithPrototypebeanDependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.TEST.SpringContext;

/**
 * 解决： 单例bean依赖多例bean ，此时的多例bean 在单例bean中也就相当于是单例的了  ，因为单例bean 就会被初始化一次
 *  1、实现 ApplicationContextWare  每次调用 多例bena时，不使用依赖注入 而是到容器中取
 *  2、@lookup
 * @Description
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019年2月28日 - 下午3:02:03
 */
public class T {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		
		PrototypeClass prototype1 = context.getBean(PrototypeClass.class);
		PrototypeClass prototype2 = context.getBean(PrototypeClass.class);
		SingleClass single1 = context.getBean(SingleClass.class);
		SingleClass single2 = context.getBean(SingleClass.class);
		SingleClass single3 = context.getBean(SingleClass.class);
		
		System.out.println("prototype1----》"+prototype1);
		System.out.println("prototype2----》"+prototype2);
//		这样
		System.out.println("single1----》"+single1.a());
		System.out.println("single2----》"+single1.a());
		System.out.println("single2----》"+single3.a());
		System.out.println("=========================================");
		SingleClass2 single4 = context.getBean(SingleClass2.class);
		System.out.println(single4.a());
		System.out.println(single4.a());
	}
}
