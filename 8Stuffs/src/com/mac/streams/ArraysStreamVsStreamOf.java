package com.mac.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStreamVsStreamOf {
	public static void main(String[] args) {
		
		int[] arr = {3,2,1};
		IntStream stream = Arrays.stream(arr);
		stream.forEach(str -> System.out.println(str));
		
		Stream<int[]> stream2 = Stream.of(arr);
		// stream2.forEach(str -> System.out.println(str));
		
		IntStream intstream = stream2.flatMapToInt(Arrays::stream);
		System.out.println("Intstream created using flatMaptoInt");
		intstream.forEach(System.out::print);
		System.out.println();
		// for char
		char[] carr = {'a','2','1','m'};
		// Arrays.stream(carr);
		Stream<char[]> cstream = Stream.of(carr);
		cstream.forEach(a -> System.out.println(a));
	}
}
