package com.mac.functionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise_Java8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Zeeshan", "Haider", 20),
				new Person("Kashif", "Ahmad" , 22 ),
				new Person ("Ravi", "Raj", 29),
				new Person("Khalid","Anwar",55)
				);
		
		
		
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastname().compareTo(p2.getLastname()));
		
		
		System.out.println("After sorting by last name, the list is " + people.toString());
		
		/*
		 * Condition myLambda = (p) -> { 
		 * 	if (p.getLastname().startsWith("A"))
		 * System.out.println(p.toString()); 
		 * 
		 * };
		 */
		
		System.out.print("Persons listed are :- ");
		Condition printAllpersonLambda = p -> true;
		print(people, printAllpersonLambda);
		
		
		System.out.println();
		
		System.out.print("Persons with last name starting with A :- ");
		Condition myLambda = p -> p.getLastname().startsWith("A");
		print(people, myLambda);
		
		
	}
	
	public static void print(List<Person> p, Condition condition) {
		for (Person person : p ) {
			if (condition.test(person)) {
				System.out.print(person.toString() + " ");
			}
		}
	}
}

interface Condition {
	boolean test(Person p);
}
