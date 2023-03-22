package com.mac.threadGroupLearn;

public class ActiveCountDemo extends Thread {
	public ActiveCountDemo(String name, ThreadGroup tg) {
		
		super(tg, name);
		System.out.println(Thread.currentThread().getName() + " is created..");
		start();
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is started..");
		for (int j = 0; j < 1000; j++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("The exception has been encountered " + e);
			}
		}
	}

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("The parent group of Threads");
		ActiveCountDemo ac = new ActiveCountDemo("first", tg);
		ActiveCountDemo ac2 = new ActiveCountDemo("second", tg);
		System.out.println(tg.activeCount());
	}
}
