package com.mac.threading;

public class ThreadSleepLesson extends Thread{
	
	@Override
	public void run() {
		for (int m = 0; m < 5; m++) {
			try {
				System.out.println(m);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * long starttime = System.currentTimeMillis();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * System.out.println(System.currentTimeMillis() - starttime);
		 */
		
		ThreadSleepLesson t1 = new ThreadSleepLesson();
		ThreadSleepLesson t2 = new ThreadSleepLesson();
		t1.start();
		t2.start();
		
		
		
	}
}
