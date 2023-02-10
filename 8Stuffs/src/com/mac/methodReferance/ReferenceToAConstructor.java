package com.mac.methodReferance;

import java.util.Arrays;
import java.util.List;

public class ReferenceToAConstructor {
	public static void main(String[] args) {
		
		List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
		
		String[] myarr =   bikeBrands.stream().map(Bicycle::new).toArray(String[]::new);
		System.out.println(myarr);
		
	}
}
