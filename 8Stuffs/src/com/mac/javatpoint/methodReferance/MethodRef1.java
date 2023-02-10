package com.mac.javatpoint.methodReferance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodRef1 {
	
	public int dohalf (int i) {
		return i/2;
	}
	
	public int dodouble (int i) {
		return i*i;
	}
	
	public List<Integer> transformAndAdd (List<Integer> list, Function<Integer, Integer> function) {
		
		return list.stream().map(function::apply).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println("original list is = " +list.toString());
		MethodRef1 obj = new MethodRef1();
		
		System.out.println("Modified list is = " +obj.transformAndAdd(list, obj::dohalf).toString());
	}
}	
