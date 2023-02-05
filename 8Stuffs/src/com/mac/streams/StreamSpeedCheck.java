package com.mac.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class StreamSpeedCheck {
	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		int count = 0;
		List<Integer> integers = new ArrayList<>();
		for (int m = 0; m < 10000000; m++) {
			integers.add(new Random().nextInt(1000));
		}
		
		System.out.println("List size = " + integers.size());
		
		start = System.currentTimeMillis();
		for (Integer i : integers)
			i++;
		end = System.currentTimeMillis();
		System.out.println("Total time taken by for loop = "  + (end - start));
		
		
		start = System.currentTimeMillis();
		integers.parallelStream().map(a -> a+1);
		end = System.currentTimeMillis();
		System.out.println("Total time taken by stream = "  + (end - start));
	}
}
