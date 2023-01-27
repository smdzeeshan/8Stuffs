package com.mac.functionalProgramming;

import java.util.Comparator;

public class LastNameCompare implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getLastname().compareTo(o2.getLastname());
	}

}
