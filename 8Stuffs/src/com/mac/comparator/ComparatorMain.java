package com.mac.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
	
	public static int compare(Movie m1, Movie m2) {
		
		return m1.getName().compareTo(m2.getName());
		
		}
	public static void main(String[] args) {
		
		List<Movie> movies = Arrays.asList(
					new Movie(2.1, "Kaal", 2002),
					new Movie(7.8, "DDLG", 1994),
					new Movie(5.5, "Badhshaah", 2001)
				
				);
		
		System.out.println("Movies listed are: " + movies.toString());
		
		Collections.sort(movies, ComparatorMain::compare);
		System.out.println("Movies listed using method referance are: " + movies.toString());
		
		System.out.println("Sorting based on rating");
		Collections.sort(movies, new RatingCompare());
		System.out.println("Movies listed are: " + movies.toString());
		
		System.out.println("Sorting based on name");
		Collections.sort(movies, NameCompare::compare);
		System.out.println("Movies listed are: " + movies.toString());
		
		System.out.println("Sorting based on year");
		Collections.sort(movies, new YearCompare());
		System.out.println("Movies listed are: " + movies.toString());
		
	}
}
