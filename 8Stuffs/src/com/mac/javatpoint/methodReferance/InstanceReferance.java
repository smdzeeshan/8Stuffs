package com.mac.javatpoint.methodReferance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceReferance {
	
	public int comparebyname (Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public int comparebyage (Person p1, Person p2) {
		return p1.getAge().compareTo(p2.getAge());
	}
	
	public static void main(String[] args) {
		
		InstanceReferance instanceReferance = new InstanceReferance();
		List<Person> personList = new ArrayList<>();
		 
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));
        
        Collections.sort(personList, instanceReferance::comparebyname );
        personList.stream().forEach(System.out::print);
        
        
		
		
	}
}
