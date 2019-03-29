package com.it.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAOP {
	/*
	*//**
	 * @Description 定义连接点
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2018年11月20日 - 上午9:54:46  
	 * @history
	 *          2018年11月20日 - 上午9:54:46 mayadong[863836234@qq.com]
	 *			.create
	 *//*
	@Pointcut("execution(* com.it.spring.App2.*(..))")
	private void aa() {
		
	}
	
	*//**
	 * @Description	定义切点
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2018年11月20日 - 上午9:53:28  
	 * @history
	 *          2018年11月20日 - 上午9:53:28 mayadong[863836234@qq.com]
	 *			.create
	 *//*
	@Before(value="com.it.aop.AspectAOP.aa()")
	public void execution() {
		System.out.println("---lalalalla");
	}
	*/
}
