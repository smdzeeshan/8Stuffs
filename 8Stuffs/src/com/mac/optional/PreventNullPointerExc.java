package com.mac.optional;

import java.util.Optional;

public class PreventNullPointerExc {
	public static void main(String[] args) {
		
		String string = null;
		Optional<String> newString = Optional.ofNullable(string);
		
		if (newString.isPresent())
			System.out.println("String in Upper case = " + string.toUpperCase());
		else
			System.out.println("No String available..");
		
		newString.ifPresent(System.out::println);
		System.out.println(newString.get());
		
		
		
	}
}
