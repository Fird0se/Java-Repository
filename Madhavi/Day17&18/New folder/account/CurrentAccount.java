package com.java.account;

import com.java.customer.Customer;

public class CurrentAccount extends Account {

	public double currentAmount;
	
	
	public CurrentAccount() {
		currentAmount = 200;
		System.out.println("default constructor of the CurrentAccount class ");
	
	}
	
	public CurrentAccount(int accountNo,Customer customer, double balance, double currentAmount){
		super(accountNo,customer,balance); 
		this.currentAmount = currentAmount;
		
		System.out.println("accountNo: " + getAccountNo() + " Balance is: " + getBalance() + " currentAmount is: " + currentAmount);
		
	}
	
	public void withdrawl(double amount){
		if ( balance < amount){
			System.out.println("InSuffitient amount ");
		}
		else
		balance = balance - amount;
		System.out.println("balance after withdrawl: " + balance);
	}
	
	public double getEligibleAmount(){
		
		double eligibleAmount = (balance + currentAmount);
		System.out.println("your eligible withdrwal amount is: " + eligibleAmount );
		
		
		return eligibleAmount;
		
	}
	

	/*public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}*/

	
}
