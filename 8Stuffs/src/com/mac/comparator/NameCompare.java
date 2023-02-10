package com.mac.comparator;

import java.util.Comparator;

public class NameCompare {
	
	
	public static int compare(Movie m1, Movie m2) {
		
		return m1.getName().compareTo(m2.getName());
		
	}
	
}
