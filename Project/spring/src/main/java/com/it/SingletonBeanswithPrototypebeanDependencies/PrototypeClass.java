package com.it.SingletonBeanswithPrototypebeanDependencies;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeClass {
	
	public PrototypeClass() {
	}
}
