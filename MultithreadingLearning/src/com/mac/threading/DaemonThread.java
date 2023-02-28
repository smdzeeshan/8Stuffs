package com.mac.threading;

public class DaemonThread implements Runnable{
	

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon())
			System.out.println(Thread.currentThread().getName() + " is daemon");
		else
			System.out.println(Thread.currentThread().getName() + " is not daemon");
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread (new DaemonThread(), "t1");
		Thread t2 = new Thread (new DaemonThread(), "t2");
		Thread t3 = new Thread (new DaemonThread(), "t3");
		
		t1.setDaemon(true);
		t1.setPriority(10);
		t1.start();
		t2.start();
		t3.setDaemon(true);
		t3.start();
		
		
	}
}
