package com.mac.MoreAboutStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LazyInvocation2 {
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> res =   integers.stream().filter( a -> {
				System.out.println("in filter ");
				return (a % 2 == 0);		
		}).map( x -> {
			System.out.println("in Map ..");
			return x;
		}).findFirst();
		
		System.out.println(res.get());
		
		
		
		
		
	}
}
