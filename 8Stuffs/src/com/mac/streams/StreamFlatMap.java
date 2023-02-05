package com.mac.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMap {
	public static void main(String[] args) {
		List<Integer> detail = Arrays.asList(1,2,3);
		List<Integer> detail2 = Arrays.asList(4,5,6);
		List<Integer> detail3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> list = Arrays.asList(detail, detail2, detail3);
		for (List<Integer> l : list)
			System.out.println(l);
		
		list.stream().flatMap(a -> a.stream()).forEach(System.out::println);
	}
}
