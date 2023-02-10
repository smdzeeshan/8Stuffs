package com.mac.methodReferance;

import java.util.Arrays;
import java.util.List;

public class ReferenceToAnInstanceMethodOfAnArbitraryObjectOfAParticularType {
	
	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle("Hero", 10);
		Bicycle bicycle2 = new Bicycle("Atlas", 15);
		Bicycle bicycle3 = new Bicycle("Jet", 5);
		
		List<Integer> bicycles = Arrays.asList(1,10,3);
		
		//bicycles.stream().sorted((b1, b2) -> b1.getFrameSize().compareTo(b2.getFrameSize())).forEach(System.out::println);
		
		System.out.println("using method reference..");
		
		bicycles.stream().sorted(Integer::compareTo).forEach(System.out::println);
	}
	
}
