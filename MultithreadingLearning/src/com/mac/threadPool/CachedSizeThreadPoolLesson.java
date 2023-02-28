package com.mac.threadPool;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedSizeThreadPoolLesson implements Runnable {
	
	private String name;
	public CachedSizeThreadPoolLesson (String name) {
		this.name = name;
	}

	@Override
	public void run(){
		
		System.out.println(Thread.currentThread().getName() + "is started");
		waitMethod();
		System.out.println(Thread.currentThread().getName() + "is finished");
	}

	private void waitMethod() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
	}
	
	public static void main(String[] args) {
		
			//ExecutorService executor = Executors.newCachedThreadPool();
			ExecutorService executor = Executors.newCachedThreadPool();
			for (int j = 0; j < 500; j++) {
				Runnable runnable = new CachedSizeThreadPoolLesson("t-" + j);
				executor.execute(runnable);
			}
	
	}
}
