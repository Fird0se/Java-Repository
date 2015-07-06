package com.java.account;

import com.java.customer.Customer;
public class Account {

	int accountNo;
	Customer customer;
	double balance;
	
	public Account(){
	
		System.out.println("default constructor of the Account class ");
		
	}
	
	public Account(int accountNo,Customer customer,double balance){
		
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("accountNo is: " + getAccountNo() + "Customer is: " + getCustomer().getcustomerName() + "avalibleBal is:  " + getBalance());
		
	}
	
	public double balanceEnq(){
		
		System.out.println("current balance is: " + balance);
		return balance;
	}
	
	public void deposit(double amount){
		
		balance = balance + amount;
		System.out.println("balance after deposit: " + balance);
	}
	
	public void withdrawl(double amount){
		
		if ( balance < amount){
			System.out.println(" The balance after withdrawal cannot be less than zero");
		}
		else
		balance = balance - amount;
		System.out.println("balance after withdrawl: " + balance);
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
