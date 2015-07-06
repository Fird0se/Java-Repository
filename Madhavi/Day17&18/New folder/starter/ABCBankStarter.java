package com.java.starter;

import com.java.account.Account;
import com.java.account.CurrentAccount;
import com.java.account.SavingsAccount;
import com.java.customer.Customer;

public class ABCBankStarter {

	public static void main(String[] args) {
		
		Customer joe = new Customer(1, "joe", "Sunnyvale", 94086);
		Account joeAccount = new Account(100,joe,2000);
		System.out.println("avalible bal for joe is: " + joeAccount.balanceEnq());
		
		joeAccount.deposit(1000);
		System.out.println(" ");
		
		Customer jhon = new Customer(2, "jhon", "SanJose", 94078);
		SavingsAccount jhonAccount = new SavingsAccount(101, jhon, 4000);
		System.out.println("avalible bal for jhon is: " + jhonAccount.balanceEnq());
		jhonAccount.deposit(1000);
		jhonAccount.calculateInterest();
		System.out.println(" ");
		
		Customer daisy = new Customer(3, "daisy", "Fremont", 72490);
		CurrentAccount daisyAccount = new CurrentAccount(102,daisy,5000,500);
		System.out.println(" Current avalibleBal is: " + daisyAccount.currentAmount);
		daisyAccount.deposit(1000);
		daisyAccount.getEligibleAmount();
		daisyAccount.withdrawl(1000);
		
	}

}
