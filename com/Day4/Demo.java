package com.Day4;

public class Demo {

	Demo(){
		this(10);
		System.out.println("Inside Demo()");
	}
	
	Demo(String s){
		this(10.50f);
		System.out.println("Inside Demo(String s)");
	}
	
	Demo(int i){
		this("Hello");
		System.out.println("Inside Demo(int s)");
	}
	
	Demo(float f){
		System.out.println("Inside Demo(float f)");
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		System.out.println(d1);
	}
}
