package com.it.SpringPublisher;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

	@Async
	@EventListener
	public void toDo(MyEvent2  event) {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("异步监听触发啦======================="+event.isFlage());
	}
	
}
