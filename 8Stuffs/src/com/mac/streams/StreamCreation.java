package com.mac.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Zeeshan","Kashif","Ravi");
		System.out.println("Printing using Sequential Stream");
		
		list.stream().forEach(System.out::println);
		System.out.println("Printing using parallel Stream");
		
		list.parallelStream().forEach(System.out::println);
		System.out.println("Using Stream.of() way");
		Stream.of("a","b","c").forEach(System.out::println);
		
		Stream.of(list).forEach(System.out::println);
	}
}