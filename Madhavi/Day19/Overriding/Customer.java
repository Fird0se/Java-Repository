package package17;

public class Customer {
	
	private int custId;
	private String custName;
	private String address;
	private long contactNos[] = new long[5];
	private static int counter;
		
	Customer(  String custName,String address,long contactNos1,long contactNo2,long contactNos3){
		
		custId = ++counter;
		this.custName = custName;
		contactNos[1] = contactNos1;
		contactNos[2] = contactNo2;
		contactNos[3] = contactNos3;
		
		
	}
	public void displayCustomerInfo(){
			System.out.println(" In SuperClass Method ");
			System.out.println("CustId: " + getCustId() + "CustName: " + getCustName() + "ContactNos1 is: " + contactNos[1] +
										"ContactNo2 is: " + contactNos[2] + "ContactNo3 is: " + contactNos[3]);
			
	}
	
	public double getBillAmount(Customer customer,double billamount,String typeOfCustomer){
		
		
		
		if(typeOfCustomer.equalsIgnoreCase("Regular")){
		RegularCustomer reg = (RegularCustomer) customer;	
		billamount = billamount-(reg.getDiscount()/100)*billamount;
		System.out.println("After discount BillAmount is: " + billamount);
		
			
		}
		return billamount;
					
	}
	public void getGift(Customer customer){
		//String s = "Silver";
		
		PrivilegedCustomer prev = (PrivilegedCustomer) customer;
		
		if ( prev.getMemberCardType().equalsIgnoreCase("Silver") ){
			
			System.out.println(" You won MICROWAVE");
		}
		else{
			System.out.println(" You won BLENDER");
		}
		
	}
	
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long[] getContactNos() {
		return contactNos;
	}
	public void setContactNos(long[] contactNos) {
		this.contactNos = contactNos;
	}
	

}
	
	


