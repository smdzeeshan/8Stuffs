package com.mac.ExecutorServiceLearn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceLesson implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " is terminated...");
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Future<String> future =  service.submit(() -> Thread.currentThread().getName() + " is running...");
			System.out.println(future.get());
		}
		
	}

}
