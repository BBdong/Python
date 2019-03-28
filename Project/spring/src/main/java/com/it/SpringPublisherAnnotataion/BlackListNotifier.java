package com.it.SpringPublisherAnnotataion;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 黑名单拦截监听
 * @Description
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019年2月26日 - 上午9:37:51
 */
@Component
public class BlackListNotifier {
	
	@EventListener
	@Async
	public void processBlackListEvent(BlackListEvent e1) {
		System.out.println(">>>>>>>>>>>>>>注解监听触发..." +e1.getAddress());
	}
	
}
