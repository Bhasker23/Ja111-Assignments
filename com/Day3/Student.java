package com.Day3;

public class Student {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " +marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.roll = 01;
		s1.name = "Ram";
		s1.marks = 700;	
		
		s1.displayStudentDetails();
		s1 = null;
		
		Student s2 = new Student();
		
		s2.roll = 02;
		s2.name = "Lakhan";
		s2.marks = 650;
		
		s2.displayStudentDetails();
		
		
		s2 = null;
		
 	}
}
