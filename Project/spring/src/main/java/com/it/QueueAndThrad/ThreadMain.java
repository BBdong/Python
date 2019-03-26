package com.it.QueueAndThrad;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {
	
	public static void main(String[] args) {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
		MyThread1 t = new MyThread1();
		final Queue qs = QueueClass.getMyQueue();
		fixedThreadPool.execute(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Iterator  Iterator  = qs.iterator();
				while(Iterator.hasNext()) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"---"+Iterator.next());
				}
			}
		});
		
		fixedThreadPool.execute(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Iterator  Iterator  = qs.iterator();
				while(Iterator.hasNext()) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"---"+Iterator.next());
				}
			}
		});
	}

}
