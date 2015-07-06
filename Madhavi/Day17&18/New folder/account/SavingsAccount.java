package com.java.account;

import com.java.customer.Customer;



public class SavingsAccount extends Account {
	
	final int interestRate = 10;
	final double minimumBalance = 200;
	
	public SavingsAccount(){
		
		System.out.println("default constructor of the SavingsAccount class ");
		System.out.println("customer minimum bal is: " + minimumBalance);
		
	}
	
	public SavingsAccount(int accountNo,Customer customer,double balance){
		
		super(accountNo,customer,balance);
		System.out.println("accountNo is: " + getAccountNo() + " Customer is: " + getCustomer().getcustomerName() + " Balance is: " +getBalance());
		
	}
	
	public double calculateInterest(){
		double irate;
	    irate = (balance*interestRate)/100;
	    System.out.println(" Interest Rate is: " + irate);
	    return irate;
		
	}
	
	public void withdrawl(double amount){
		
		if ( balance < minimumBalance){
			System.out.println(" minimumBalance " + minimumBalance + " is not maintained ");
		}
		else
		balance = balance - amount;
		System.out.println("balance after withdrawl: " + balance);
	}
	
	
	
	

}
