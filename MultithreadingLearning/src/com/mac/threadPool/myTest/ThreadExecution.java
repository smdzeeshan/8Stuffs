package com.mac.threadPool.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecution {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable r = new ThreadsCreation(i);
			service.execute(r);
		}
		
	}
}
