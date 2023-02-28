package com.mac.threadPool;

public class SynchronizedDemo implements Runnable{
	
	static int num = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			num++;
			System.out.println(Thread.currentThread().getName() + " has incremented num. Value = " + num);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new SynchronizedDemo(), "t1");
		Thread t2 = new Thread(new SynchronizedDemo(), "t2");
		t1.start();
		t2.start();	
	}
	
}
