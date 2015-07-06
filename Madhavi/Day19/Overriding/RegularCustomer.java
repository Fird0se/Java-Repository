package package17;

public class RegularCustomer extends Customer {
	
	private double discount;
	
	
	public RegularCustomer(String custName,String address,long contactNos1,long contactNo2,long contactNos3,double discount) {
		
		super(custName, address, contactNos1, contactNo2, contactNos3);
		this.discount = discount;
		//System.out.println("discount is: " + discount);				
		
	}
	
	public void displayCustomerInfo(){
		
		super.displayCustomerInfo();
		System.out.println(" In SubClass Method ");
		System.out.println(" discount is: " + getDiscount());
		
	}

	public double getDiscount() {
	return discount;
	}

	public void setDiscount(double discount) {
	this.discount = discount;
	}
}
