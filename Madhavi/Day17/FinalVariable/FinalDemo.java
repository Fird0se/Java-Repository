package package15;

public class FinalDemo {
	
	private String fName;
	private String lName;
	final int ROLL_NO = 456;
	
	public FinalDemo(){
		
		//ROLL_NO = 526;
	}
	
	public FinalDemo(String fName,String lName){
		
		//ROLL_NO = 526;
		this.fName = fName;
		this.lName = lName;
		
		
	}
	
	public void display(){
		
		System.out.println("RollNumber is: " + ROLL_NO);
	}
	
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	

}
