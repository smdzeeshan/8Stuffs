package com.mac.MoreAboutStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmptyStreams {
	
		public static void main(String[] args) {
			
			Stream<String> stream = Stream.empty();
			stream.forEach(System.out::println);
			
			List<String> strings = null;
			strings.stream().forEach(System.out::println);
			
			System.out.println(check (strings).collect(Collectors.joining(",")));
			
			
			
	}
		private static Stream<String> check(List<String> strings) {
			return strings == null ? Stream.empty() : strings.stream();
		}

		
}
