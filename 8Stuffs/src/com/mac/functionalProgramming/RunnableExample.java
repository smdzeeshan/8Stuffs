package com.mac.functionalProgramming;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed Inside Runnable");
			}
			
		});
		
		myThread.run();
		 	
		Thread myLambdaThread = new Thread ( () -> System.out.println("Printed inside lambda thread"));
		myLambdaThread.run();
		
	}

}
