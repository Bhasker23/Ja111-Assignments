package com.Day4;

public class OddEven {

	void fun(int num) {
		if(num % 2 != 0) {
			System.out.println("Odd");
		}
		else if(num < 0) {
			System.out.println("Error");
		}
		else if (num % 2 == 0) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		
		OddEven num = new OddEven();
		num.fun(44);
	}
}
