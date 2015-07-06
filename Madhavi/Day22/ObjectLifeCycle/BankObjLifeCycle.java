package package20;

public class BankObjLifeCycle {
	
	private int bankId;
	private String bankName;
	private String location;
	

	public BankObjLifeCycle(){
		
		System.out.println("default constructor");
		
	}
	
	public BankObjLifeCycle(int bankId,String bankName,String location){
		
		this.bankId = bankId;
		this.bankName = bankName;
		this.location = location;
			
	}
	
	public void bankInfo(){
		
		System.out.println("BankId is: " + getBankId() + "BankName is: " + getBankName() + "BankLocatio is at: " + getLocation());
	}
	
	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
}
