package com.Day4.Problem3;


public class Demo {

	public static void main(String[] args) {
		
	Student.getStudent(true);	 
	 
	 Student st1 = new Student(1, "Gopal", "Udaipur");
	 
	 st1.setCollageName("NIT");
	 
	 System.out.println("Student 1 Details");
	 
	 System.out.println(st1.getRoll());
	 System.out.println(st1.getName());
	 System.out.println(st1.getAddress());
	 System.out.println(st1.getCollageName());
	 
	 System.out.println();
	 System.out.println("----------------------------");
	 System.out.println();
	 
	 Student.getStudent(false);	
	 
	 Student st2 = new Student(2, "Hari", "Gujrat" , "IIT");
	 
	 System.out.println("Student 2 Details");
	 
	 System.out.println(st2.getRoll());
	 System.out.println(st2.getName());
	 System.out.println(st2.getAddress());
	 System.out.println(st2.getCollageName());
			 
	}
}
