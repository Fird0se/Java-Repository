package package18;

//public class CompDetails extends CompName{
	
public class CompDetails{	
	private String location;
	private int zipcode;
	
	public CompDetails(String companyName,String location,int zipcode){
		
	//	super(companyName);
		this.location =location;
		this.zipcode = zipcode;
	}
	
	public void myMethod(){						//overriding method
		
		System.out.println("location is: " +getLocation() + "zipcode is: " +getZipcode());
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	
	

}
