package com.mac.threadPool.myTest;

public class ThreadsCreation implements Runnable{
	
	private int num;

	public ThreadsCreation(int num) {
		super();
		this.num = num;
	}



	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing.. = " + num );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(Thread.currentThread().getName() + " has ended..");
	}

}
