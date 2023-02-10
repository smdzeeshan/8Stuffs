package com.mac.optional;

import java.util.Optional;

public class Optional_Methods {

	public static void main(String[] args) {
		String[] str = new String[10];        
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; 
        
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        
        Optional<String> value = Optional.of(str[5]);
        System.out.println(value);
        
        Optional<String> filteredString = value.filter(a -> a.contains("JAVA"));
        System.out.println(filteredString);
        
        Optional<String> filteredString2 = value.filter(a -> a.contains("abc"));
        System.out.println(filteredString2);
        filteredString2.ifPresent(System.out::println);
        
        System.out.println(filteredString.get());
        System.out.println(filteredString.hashCode());
        System.out.println(filteredString.isPresent());
        System.out.println("Nullable Optional: " + Optional.ofNullable(filteredString.get())); 
        System.out.println(filteredString2.orElse("No string"));
	}

}
