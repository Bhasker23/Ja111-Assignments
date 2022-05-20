package com.Day3;

public class CheckWeather {

public static void main(String[] args) {
	
	boolean isSnowing = true;
	boolean isRaining = false;
	double temperature = 80.0;
	
	if (isRaining == true || isSnowing == true || temperature > 50) {
		System.out.println("Let’s stay home");
		
	}
	else if (isRaining == false || isSnowing == false || temperature < 50 )  {
		System.out.println("Let’s go out!");
	}
}
}
