package com.mac.threadGroupLearn;

public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is created");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " is ended");
	}
	
	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("Group A");
		Thread t1 = new Thread(tg1, new ThreadGroupDemo(),"Thread-1" );
		Thread t2 = new Thread(tg1, new ThreadGroupDemo(),"Thread-2" );
		Thread t3 = new Thread(tg1, new ThreadGroupDemo(),"Thread-3" );
		
		System.out.println(t1.getThreadGroup().getName());
		t1.start();
		t2.start();
		t3.start();
		tg1.interrupt();
	}

}
