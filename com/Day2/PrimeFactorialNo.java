package com.Day2;

 class PrimeFactorialNo {
	 
	 static void prim(int num) {
		 
		 if(num >= 2 && num <= 100) {
			 for (int i = 1; i <= num; i++) {
					if (num % i == 0) {
						System.out.println(i);
					}
				} 
		 }
		 else {
			System.out.println("Invalid number");
		}
		 
	 }
	 public static void main(String[] args) {

		 prim(10);
		 
//		 PrimeFactorialNo n1 = new PrimeFactorialNo();
		 
//		 n1.prim(10);
		 
		 
			 
			
		}
}
