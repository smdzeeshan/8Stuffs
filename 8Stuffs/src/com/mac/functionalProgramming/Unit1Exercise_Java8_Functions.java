package com.mac.functionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise_Java8_Functions {

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
		Predicate<Person> printAllpersonLambda = p -> true;
		print(people, printAllpersonLambda, (p) -> System.out.println(p.toString()));
		
		
		System.out.println();
		
		System.out.print("Persons with last name starting with A :- ");
		Predicate<Person> condition = p -> p.getLastname().startsWith("A");
		print(people, condition, (p) -> System.out.println(p.toString()));
		
		
	}
	
	public static void print(List<Person> p, Predicate<Person> predicate, Consumer<Person> consumer)  {
		for (Person person : p ) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
