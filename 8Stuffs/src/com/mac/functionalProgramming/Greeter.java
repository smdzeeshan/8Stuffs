package com.mac.functionalProgramming;

public class Greeter{
	
	public void greeting(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();

		Greeting greetingLambda = () -> System.out.println("Hello Lambda");
		Greeting greeting = new HelloWorldGreeting();
		greeter.greeting(greeting);
		greeter.greeting(() -> System.out.println("Hello Lambda"));
		greeter.greeting(greetingLambda);
	
	}
} 

	/*
	 * greetingFunction = () -> System.out.println("Hello World");
	 * doubleNumberFunction = (int a) -> a*2 ; addFunction = (int a, int b) -> a+b ;
	 * safeDivideFuction = (int a, int b) -> { if (b=0) return 0; return a/b;
	 * 
	 * };
	 * 
	 * stringLengthCountFunction = (String s) -> s.length();
	 */