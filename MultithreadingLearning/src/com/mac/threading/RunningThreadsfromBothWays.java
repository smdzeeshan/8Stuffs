package com.mac.threading;

public class RunningThreadsfromBothWays {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadRunnableLesson(), "t1");
		Thread t2 = new Thread(new ThreadRunnableLesson(), "t2");
		System.out.println("Invoking threads using runnable interface..");
		t1.start();
		t2.start();
		
		Thread t3 = new UsingThreadClassLesson();
		Thread t4 = new UsingThreadClassLesson();
		System.out.println("Running threads by extending thread class..");
		t3.start();
		t4.start();
		
		while (true) {
			
		}
		
		
	}
}
