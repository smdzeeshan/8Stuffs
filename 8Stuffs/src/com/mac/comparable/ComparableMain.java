package com.mac.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		List<Student> studs = Arrays.asList(
				new Student(20,"Zeeshan","Haider"),
				new Student(19,"Kashif","Ahmad"),
				new Student(32,"John","Smith")
				);
		
		System.out.println("Students are : " + studs.toString());
		System.out.println("Sorting based on age");
		Collections.sort(studs);
		//studs.sort(null);
		System.out.println("Students are : " + studs.toString());
		
				
	}

}
