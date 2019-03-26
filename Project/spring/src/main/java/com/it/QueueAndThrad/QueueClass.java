package com.it.QueueAndThrad;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueueClass {
	public static Queue<String> q = new LinkedList<>();
	
	public static  Queue getMyQueue() {
		q.add("q0");
		q.add("q1");
		q.add("q2");
		q.add("q3");
		q.add("q4");
		q.add("q5");
		q.add("q6");
		q.add("q7");
		q.add("q8");
		q.add("q9");
		System.out.println(q.size());
		return q;
	}
}
