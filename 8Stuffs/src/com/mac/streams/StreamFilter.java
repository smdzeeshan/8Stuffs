package com.mac.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ten","Twenty","One","two");
		Stream<String> stream = list.stream().filter(a -> a.contains("T"));
		stream.forEach(a -> System.out.println(a));
		
		List<Integer> intList = Arrays.asList(1,2,4,5,4);
		intList.stream().distinct().filter(a -> a%2 ==0).forEach(System.out::println);
		
	}
}
