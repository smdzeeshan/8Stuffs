package com.mac.methodReferance;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ReferanceToStaticMethod {
	
	public static void main(String[] args) {

		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		
		messages.forEach(StringUtils::capitalize);
		
		
		
	}
	
}
