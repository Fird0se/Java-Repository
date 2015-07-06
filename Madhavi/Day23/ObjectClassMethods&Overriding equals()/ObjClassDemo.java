package package21;

public class ObjClassDemo {
	
	private int id;
	private String name;
	private int zipcode;
	
	public ObjClassDemo(){
		
	}
	
	public ObjClassDemo(int id,String name,int zipcode){
		
		this.name = name;
		this.id = id;
		this.zipcode = zipcode;
	}
	
	public void displayInfo(){
		
		System.out.println("Name: " + name + "\nId: " + getId() + "\nZipcode: " + getZipcode() + "\n");
	}
	
	protected void finalize( ) {
		
		System.out.println("this method will execute when an obj is about to garbaged");
		
	}
	
	public boolean equals(Object obj){
		
		if ( obj == null){
			
		return true;
		}
		else{
		return false;
		}
		
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
	

}
