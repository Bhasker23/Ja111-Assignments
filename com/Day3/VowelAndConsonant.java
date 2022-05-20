package com.Day3;

public class VowelAndConsonant {

	void showCharcterType(char alpha) {
		if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o'
			||	alpha == 'u') {
			System.out.println("Vowel");
		}
		else if(alpha == 'b' ||alpha == 'c' || alpha == 'd' ||alpha == 'f' ||alpha == 'g' ||alpha == 'h' ||alpha == 'j' ||alpha == 'k' ||
				alpha == 'l' ||alpha == 'm' ||alpha == 'n' ||alpha == 'p' ||alpha == 'q' ||alpha == 'r' ||alpha == 's' ||alpha == 't' ||alpha == 'v' ||
				alpha == 'w' ||alpha == 'x' ||alpha == 'y' ||alpha == 'z') {
			
			System.out.println("Consonant");
		}
		else {
			System.out.println("Not a Alaphabate");
		}
		
	}
	
	public static void main(String[] args) {
		
		VowelAndConsonant c1 = new VowelAndConsonant();
		c1.showCharcterType('a');
		c1.showCharcterType('c');
		c1.showCharcterType('2');
		
	
		
	}

}
