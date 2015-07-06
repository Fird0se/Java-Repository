package com.java.customer;

public class Customer {
	
	 public int customerId;
	String customerName;
	String customerAddress;
	int zipcode;
	
	public Customer(){
		
		System.out.println("default constructor of the Customer class ");
		
	}
	
	public Customer(int customerId,String customerName,String customerAddress,int zipcode){
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.zipcode = zipcode;
		System.out.println("In paramerized constructor of Customer :- ");
		System.out.println("customerId: " + getcustomerId() + "\ncustomerName is: " + getcustomerName() + "\ncustomerAddess is: " + getcustomerAddress() + "\nZipcode is: " + getZipcode());;
	}
	
	public int getcustomerId() {
		return customerId;
	}

	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getcustomerAddress() {
		return customerAddress;
	}

	public void setcustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	
	

}
