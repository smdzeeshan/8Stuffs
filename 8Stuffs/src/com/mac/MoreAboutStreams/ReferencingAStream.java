package com.mac.MoreAboutStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReferencingAStream {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream =  integers.stream();
		Optional<Integer> a = stream.findAny();
		Optional<Integer> b = stream.findAny();
		
	}

}
