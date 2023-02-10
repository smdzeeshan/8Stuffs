package com.mac.javatpoint.methodReferance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodRef {
	
	public static int comparebyname (Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public static int comparebyage (Person p1, Person p2) {
		return p1.getAge().compareTo(p2.getAge());
	}
	
	public static void main(String[] args) {
		
		
		List<Person> personList = new ArrayList<>();
		 
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));
        
        Collections.sort(personList, StaticMethodRef::comparebyname );
        personList.stream().forEach(System.out::print);
        
        
		
		
	}
}
