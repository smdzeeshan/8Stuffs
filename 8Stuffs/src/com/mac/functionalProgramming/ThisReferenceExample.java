package com.mac.functionalProgramming;

public class ThisReferenceExample {

	public void doProcess (int i, Process p) {
		p.process(i);
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, (i) -> System.out.println(i));
		
		
	}
	
	public interface Process{
		void process(int i);
	}
}
