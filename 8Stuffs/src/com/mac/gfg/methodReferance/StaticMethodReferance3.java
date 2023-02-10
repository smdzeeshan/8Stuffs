package com.mac.gfg.methodReferance;

import java.util.function.BiFunction;

public class StaticMethodReferance3 {

	public static int add (int a, int b) {
		int z = a+b;
		return z;
	}
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> biFunction = StaticMethodReferance3::add;
		int res = biFunction.apply(1, 2);
		System.out.println(res);
	}
}