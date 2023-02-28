package com.mac.threading;

public class ThreadRunnableLesson implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " is executing with id = "+ Thread.currentThread().getId());
	}
}
