package com.mac.threading;

public class ThreadNaming extends Thread{
	@Override
	public void run() {
		for (int m = 0; m < 5; m++) {
			System.out.println(Thread.currentThread().getName() + " of priority " + Thread.currentThread().getPriority() + " is executing..");
		}
	}
	
	public ThreadNaming(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadNaming("z1");
		Thread t2 = new ThreadNaming("z2");
		Thread t3 = new ThreadNaming("z3");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
