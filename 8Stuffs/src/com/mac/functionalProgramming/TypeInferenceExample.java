package com.mac.functionalProgramming;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// StringLengthLambda stringLengthLambda = (String s) -> s.length();
		function( s -> s.length() );
	}
	
	public static void function (StringLengthLambda l) {
		System.out.println(l.getLength("Hello World"));
	}

}

	interface StringLengthLambda {
		int getLength(String s);
}