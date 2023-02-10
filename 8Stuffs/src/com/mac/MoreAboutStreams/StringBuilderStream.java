package com.mac.MoreAboutStreams;

import java.util.stream.Stream;

public class StringBuilderStream {
	public static void main(String[] args) {
		
		String str1 = "class";
		String str2 = "Java";
		String str3 = "Streams";
		
		Stream<String> res = Stream.<String>builder().add(str1).add(str2).add(str3).build();
		res.forEach(System.out::print);
 		
	}
}
