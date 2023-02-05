package com.mac.streams;

import java.util.Arrays;
import java.util.List;

public class StreamIteration {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc","pqa","xyz","kop");
		boolean res = list.stream().anyMatch(element -> element.contains("g"));
		System.out.println(res);
	}
}
