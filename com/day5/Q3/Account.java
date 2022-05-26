package com.day5.Q3;


public class Account {

	private int accountId;
	private String accountType;
	private int balance;
	
	
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	
	public void setBalance(int balance) {
		
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	 public boolean withdraw(int withdrawn) {
		 
		 boolean r = false;
		 
		 if (balance >= withdrawn) {
			this.balance =  this.balance -withdrawn;
			System.out.println("Balance amount after withdraw : " + this.balance);
			 r =  true;
		}
		 else if (this.balance < withdrawn) {
			System.out.println("Sorry!!! No enough balance");
		
		}
		
		return r; 
	 }
}
