package com.mac.MoreAboutStreams;

import java.util.Arrays;
import java.util.List;

public class StreamSkip {
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3);
		integers.stream().skip(1).forEach(System.out::println);;
		
	}
}
