package com.mac.streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,4,5,4);
		intList.stream().map(a -> a*2).forEach(System.out::println);
		
		List<String> uris = new ArrayList<>();
		uris.add("C:\\My.txt");
		uris.stream().map(uri -> Paths.get(uri)).forEach(System.out::println);
	}
}
