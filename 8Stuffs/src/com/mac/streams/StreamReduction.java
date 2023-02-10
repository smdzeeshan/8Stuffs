package com.mac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class StreamReduction {
	public static void main(String[] args) {
		
		List<String> students = Arrays.asList("Emma Watson", "Paul Walker", "Leesa", "James", "Lilly");   
		String stud = students.stream().reduce(" ", (longest, nextElement) -> longest.length() > nextElement.length() ? longest : nextElement);
		System.out.println(stud);
		
		Optional<String> newString = students.stream().reduce((firstName, secondName)-> firstName.length() > secondName.length()? firstName : secondName);   
		System.out.println(newString.get());
		
		/* sum_operation */
		List<Integer> numbers = Arrays.asList();
		Optional<Integer> sum = numbers.stream().reduce((a ,b) -> a + b); // or Integer::sum
		if (sum.isPresent())
			System.out.println(sum.get());
		
		
		
		/* average */
		
		
		int average = numbers.stream().reduce((a,b) -> a+b).orElse(0) / numbers.size();
		System.out.println(average);
		
		
		/* Parallel Stream - Using Combiner */
		// No need 
		Optional<Integer> res1 = numbers.parallelStream().reduce((a, b) -> a+b);
		if (res1.isPresent())
			System.out.println(res1.get());
		
		Optional<String> res2 =  students.parallelStream().reduce((a,b) -> a+b);
		if (res2.isPresent())
			System.out.println(res2.get());
		
		List <String> numbers3 = Arrays.asList("one", "two", "three", "four", "five", "six", "seven" , "eight", "nine", "ten");
		
        String result = numbers3.parallelStream().reduce(" ", (first, second) -> first + second,  String::concat );
        System.out.println("result = " + result);
        
        numbers3.stream().reduce(0, (a,b) -> a + b.length() , Integer::sum);
        
        List<Integer> list = new ArrayList<>();
        
        for (int m = 0; m < 10; m++) {
			
			list.add(m+1);
		}
        
        System.out.println("The generated list is " + list.toString());
        list.stream().reduce((a,b) -> a*b).ifPresent(System.out::println);
        list.parallelStream().reduce((a,b) -> a*b).ifPresent(System.out::println);
	}
}
