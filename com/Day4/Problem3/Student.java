package com.Day4.Problem3;


public class Student {

	 int roll;
	 String name;
	 String address;
	 String collageName;
	
	
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
	
	 public Student(int roll,String name,String address) {
		 
		 this.roll = roll;
		 this.name = name;
		 this.address = address;
	 }
	 
		
	 public Student(int roll,String name,String address,String collegeName) {
		 
		 this.roll = roll;
		 this.name = name;
		 this.address = address;
		 this.collageName = collegeName;
	 }
	 
	 
	 public Student() {
		
	}
	 
	public int getRoll() {
		return roll;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getCollageName() {
		return collageName;
	}
	
	public static Student getStudent(boolean isFromNIT) {
			
		Student s1 = new Student();
		
		return s1;
	}
	

}
