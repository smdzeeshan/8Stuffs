package com.mac.functionalProgramming;

import java.util.function.BiConsumer;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int[] someNumbers = {2,3,4,5};
		int key = 0;
		doprocess(someNumbers, key, wrapperLambda ((a,b) -> System.out.println(a/b)));
	}
	
	public static void doprocess(int[] someNumbers, int k, BiConsumer<Integer, Integer> consumer) {
		for (int m : someNumbers)
			consumer.accept(m, k);	
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}
			
			catch (Exception e) {
				System.out.println("Can't divide by Zero");
			}
		};
	}
}
