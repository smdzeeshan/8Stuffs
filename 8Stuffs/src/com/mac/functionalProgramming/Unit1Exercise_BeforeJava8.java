package com.mac.functionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise_BeforeJava8 {
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Zeeshan", "Haider", 20),
				new Person("Kashif", "Ahmad" , 22 ),
				new Person ("Ravi", "Raj", 29),
				new Person("Khalid","Anwar",55)
				);
		
		print(people);
		
		Collections.sort(people, new LastNameCompare());
		System.out.print("After sorting by last name, ");
		print(people);
		
		printPeopleWithLastNameStartingWithA(people);
		
	}
	
	private static void printPeopleWithLastNameStartingWithA(List<Person> people) {
		System.out.print("People with LastName starting with A : ");
		for (Person p : people) {
			if (p.getLastname().startsWith("A")) {
				System.out.print(p.toString() + " ");
			}
		}
		
		
		
	}

	public static void print(List<Person> people) {
		System.out.println( "Persons are :- " + people.toString());
		
	}
	
	
}
