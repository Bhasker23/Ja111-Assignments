package com.day5.Q3;

import java.util.Scanner;

public class AccountDetails {
	
	public  Account getAccountDetails() {
		
		Account a1 = new Account();
		
		Scanner ac1 = new Scanner(System.in);
		
		System.out.println("Enter account ID : ");
		int acID =  ac1.nextInt();
		
		ac1.nextLine();
		
		System.out.println("Enter account type : ");
		String acType =  ac1.nextLine();
		
		
		while(true) {
			System.out.println("Enter balance : ");
			int balance = ac1.nextInt();
			if (balance <= 0) {
				System.out.println("Account Balance should be positive");
				
			}
			else {
				a1.setBalance(balance);
				break;
				}
		}
	
		a1.setAccountId(acID);
		a1.setAccountType(acType);

		return a1;
	}
	
	public int getWithdrawAmount() {
	
		Scanner ac1 = new Scanner(System.in);
		
		int withdrawn = 0;
		
		while (true) {
			System.out.println("Enter amount to be withdrawn : ");
			
			 withdrawn = ac1.nextInt();
			
			if (withdrawn > 0) {
				break;
			}
			else if (withdrawn <=  0) {
				System.out.println("Withdrawn Amount should be positive.");
			}
		}
		
		return withdrawn;
		

	}

	public static void main(String[] args) {
		
		AccountDetails ac1 = new AccountDetails();
		
		Account a1 = ac1.getAccountDetails();
		int withdraw =   ac1.getWithdrawAmount();
		a1.withdraw(withdraw);
		

	}
}
