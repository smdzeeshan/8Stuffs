package com.mac.gfg.methodReferance;

public class StaticMethodReferance2 {
	
	public static void myRun() {
		System.out.println("Running...");
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(StaticMethodReferance2::myRun);
		thread.run();
		
	}
}

