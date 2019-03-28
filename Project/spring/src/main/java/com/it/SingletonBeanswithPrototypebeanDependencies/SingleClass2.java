package com.it.SingletonBeanswithPrototypebeanDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
/**
 * 使用 lookup实现
 * @Description
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019年2月28日 - 下午4:01:21
 */
@Component
public abstract class SingleClass2 {
	
	
	public PrototypeClass a() {
		PrototypeClass prototypeClass  = createPrototypeClass();
		return prototypeClass;
	}
	
	@Lookup("prototypeClass")
    protected abstract PrototypeClass createPrototypeClass();
	
}
