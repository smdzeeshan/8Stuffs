package com.mac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamCollectors {
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Zeeshan","Tiger","India","Asia");
		strings = strings.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		
		System.out.print("The new List<String> is = ");
		strings.stream().map(str -> str+" ").forEach(System.out::print);
		System.out.println();
		
		System.out.println("Printing using Collectors.joiner()");
		String string = strings.stream().collect(Collectors.joining(",", "MyStrings__", "__EndStrings"));
		System.out.println(string);
		
		// List<Integer> integers = Arrays.asList(1,2,3,4,5);
		List<Integer> integers = new ArrayList<>();
		for (int m = 0; m < 1000; m++) {
			integers.add(new Random().nextInt(1000));
		}
		
		System.out.println("List of integers are: ");
		integers.stream().map(a -> a + " ").forEach(System.out::print);
		System.out.println();
		
		System.out.print("Sum = " );
		int sum = integers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
		System.out.print("Average is= ");
		System.out.println(integers.stream().collect(Collectors.averagingInt(Integer::intValue)));
		
		System.out.print("Summary is= ");
		System.out.println(integers.stream().collect(Collectors.summarizingInt(Integer::intValue)));
		
		System.out.print("Extracting Average from IntSummaryStatistics = ");
		System.out.println(integers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage());
		
		System.out.println("Grouping by..");
		Map<Integer, List<Integer>> map = integers.stream().collect(Collectors.groupingBy(Integer::intValue));
		System.out.println(map.toString());
		
		System.out.println("Partioning by..");
		Map<Boolean, List<Integer>> map2 = integers.stream().collect(Collectors.partitioningBy( (a) -> a > 10));
		System.out.println(map2.toString());
		
		System.out.println("teeing by..");
		Optional<Integer> res1 = integers.stream().collect(Collectors.minBy(Integer::compareTo));
		System.out.println(res1.get());
		
		Optional<Integer> res2 = integers.stream().collect(Collectors.maxBy(Integer::compareTo));
		System.out.println(res2.get());
	}
}
