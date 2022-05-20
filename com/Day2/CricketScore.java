package com.Day2;

public class CricketScore {
	
	static void score(int ones, int twos ,int three ,int fours , int sixs) {

		System.out.println((1*ones)+(2*twos)+(3*three)+(4*fours)+(6*sixs));
	}
	
	public static void main(String[] args) {
		
		score(12, 9, 2, 8, 9);
	
		
	}
}
