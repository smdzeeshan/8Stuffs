package com.mac.methodReferance;

import java.util.Arrays;
import java.util.List;

public class ReferenceToAnInstanceMethodofaParticularObject {
	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle("Hero", 10);
		Bicycle bicycle2 = new Bicycle("Atlas", 15);
		Bicycle bicycle3 = new Bicycle("Jet", 5);
		
		List<Bicycle> bicycles = Arrays.asList(bicycle,bicycle2, bicycle3);
		bicycles.stream().sorted((b1, b2) -> new BicycleComparator().compare(b1, b2)).forEach(System.out::println);
		
		System.out.println("Using method references");
		bicycles.stream().sorted(new BicycleComparator()::compare).forEach(System.out::println);

	}
}
