package com.mac.MoreAboutStreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfArrays {
	public static void main(String[] args) {
		
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 0, 2);
		
		print(streamOfArrayFull);
		print(streamOfArrayPart);
		
		
	}

	private static void print(Stream<String> stream) {
		stream.forEach(System.out::println);
	}
}
