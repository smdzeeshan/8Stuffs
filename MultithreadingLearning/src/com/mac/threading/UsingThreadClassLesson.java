package com.mac.threading;

public class UsingThreadClassLesson extends Thread {
	
	@Override
	public void run() {
		System.out.println( Thread.currentThread() + " is executing with id = "+ Thread.currentThread().getId());
	}
}
