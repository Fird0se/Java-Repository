package package17;

public class PrivilegedCustomer extends Customer{
	
	private String memberCardType;
	
	

	public PrivilegedCustomer(String custName,String address,long contactNos1,long contactNo2,long contactNos3,String memberCardType) {
		
		super(custName, address, contactNos1, contactNo2, contactNos3);
		this.memberCardType = memberCardType;
		System.out.println("cardType: " + memberCardType);
		
	}
	
	public void displayCustomerInfo(){
		
		super.displayCustomerInfo();
		System.out.println(" In SubClass Method ");
		System.out.println(" CardType" + getMemberCardType());
		
	}
	
	public String getMemberCardType() {
		return memberCardType;
	}


	public void setMemberCardType(String memberCardType) {
		this.memberCardType = memberCardType;
	}



}
