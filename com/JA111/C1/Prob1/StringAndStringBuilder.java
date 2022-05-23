package com.JA111.C1.Prob1;

public class StringAndStringBuilder {

//	Why String is immutable :-
	
//	Strings are immutable because this a type of Class and in java we can not change the class type by 
//	our self.Strings are available in java predefined libraries. 
//	If we want to change the string then have to use String Builder.
	
// Difference between String and String Builder?
	
//	The difference between String and String Builder is, Strings are immutable basically but if want to change the string 
//	this string you has to use to String builder.
//	String Builder makes Strings as mutable, and in the String Builder method you have to create an object for making string as mutable 
	
	

	public static void main(String[] args) {

		// Example of String methods.
		
		String s1 = "welcome";
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		System.out.println(s1.indexOf("c"));
			
	}

	
	
}
