package package17;

import java.util.Scanner;

public class CustomerStarter {

	public static void main(String[] args) {
		
		System.out.println("enter CustomerType: ");
		Scanner input = new Scanner(System.in);
		String typeOfCustomer = input.next();
		Customer customer = null;
		
		if(typeOfCustomer.equalsIgnoreCase("Regular"));
		customer = new RegularCustomer("dgh", "NewYork", 6788, 7889, 6889, 10.0);
		customer.getBillAmount(customer, 5000, typeOfCustomer);
		customer.displayCustomerInfo();
		
		
		if(typeOfCustomer.equalsIgnoreCase("Privileged"));
		customer = new PrivilegedCustomer("Michal", "California", 67237, 84394, 246738, "Silver");
		customer.displayCustomerInfo();
		customer.getGift(customer);
		
		customer = new PrivilegedCustomer("aghs", "shaj", 5266, 3677, 2177, "gold");
		customer.displayCustomerInfo();
		customer.getGift(customer);
		
		

	}

}
