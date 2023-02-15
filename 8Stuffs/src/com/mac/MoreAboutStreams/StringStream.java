package com.mac.MoreAboutStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStream {
	public static void main(String[] args) {

		String string = "abc";
		IntStream intStream = string.chars();
		intStream.forEach(System.out::println);
		Stream.of(string).forEach(System.out::println);
	}
}
