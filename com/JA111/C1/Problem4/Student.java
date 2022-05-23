package com.JA111.C1.Problem4;

public class Student {

	private int rollNumber;
	private String studentName;
	private double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber,String studentName,double marks) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public double getMarks() {
		return marks;
	}
	
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
}
