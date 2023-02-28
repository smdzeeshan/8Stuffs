package com.mac.threading;

public class ThreadsInLargeNumber extends Thread {
	
	@Override
	public void run() {
		for (int m = 0; m < 5; m++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " of priority " + Thread.currentThread().getPriority() + " is executing..");
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100000000; i++) {
			new ThreadsInLargeNumber().start();
		}
	}
	
	
}
