package com.mac.threading;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println("Starting thread = " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello from " + Thread.currentThread().getName());
			
		}
		System.out.println("Terminating thread = " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadTest(), "t1");
		t1.start();
		Thread t2 = new Thread(new ThreadTest(), "t2");
		t2.start();
		for (int i = 0; i < 10000; i++) {
			System.out.println("Hello..");
		}
	}
	
}
