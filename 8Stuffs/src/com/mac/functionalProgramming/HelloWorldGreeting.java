package com.mac.functionalProgramming;

public class HelloWorldGreeting implements Greeting{

	@Override
	public void perform() {
		System.out.println("Hello World");
	}
	
	public void test() {
		System.out.println("Test Method");
	}

}
