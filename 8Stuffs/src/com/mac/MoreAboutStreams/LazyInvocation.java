package com.mac.MoreAboutStreams;

import java.util.Arrays;
import java.util.List;

public class LazyInvocation {

	
	public static void main(String[] args) {
		int count = 0;
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		integers.stream().map( a-> {
			
			counter(count);
			return a+1;
		}).forEach(System.out::println);

		System.out.println("count = " + count);
		
		
	}
	
	
	public static int counter (int count) {
		return ++count ;
	}

}
