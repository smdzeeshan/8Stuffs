package com.mac.MoreAboutStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateGenerateStream {
	public static void main(String[] args) {
		
		Stream.iterate(40, n -> n+2).limit(5).forEach(System.out::println);
		System.out.println("************");
		Stream.generate(() -> "Zeeshan").limit(5).forEach(System.out::println);
		//List<Integer> list   = Stream.generate(() -> new Random().nextInt(20)).limit(5).collect(Collectors.toList());
		//System.out.println(list);
	}
}
