package com.mac.gfg.methodReferance;

public class StaticMethodReferance {

	public static void saysomething() {
		System.out.println("I am saying hello !!");
		
	}
	
	public static void main(String[] args) {
		
		Sayable sayable = StaticMethodReferance::saysomething;
		sayable.say();
	
	}
}

interface Sayable {
	void say();
}
