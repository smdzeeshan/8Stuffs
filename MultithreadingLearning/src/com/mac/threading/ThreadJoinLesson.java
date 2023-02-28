package com.mac.threading;

public class ThreadJoinLesson implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is started..");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is ended..");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadJoinLesson(), "t1");
		Thread t2 = new Thread(new ThreadJoinLesson(), "t2");
		Thread t3 = new Thread(new ThreadJoinLesson(), "t3");
		
		t1.start();
		
		t1.join(10);
		
		t2.start();
		
		t2.join(10);
		t3.start();
		
	}
	
}
