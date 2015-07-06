package package20;

public class EmpInfo {
	
	private int empId;
	private String firstName;
	private String lastName;
	
	
	public EmpInfo(){
		
		System.out.println("Id is: " + empId + "firstName is: " + firstName + "lastName is: " + lastName);
	}
	
	public EmpInfo(int empId,String firstName,String lastName){
		
		this.empId=empId;
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EmpId is: " + getEmpId() + "EmpFirstName: " +getFirstName() + "EmpLastName is: " +getLastName());
	}
	
	public void displayInfo(EmpInfo emp){
		
		System.out.println("EmpId is: " + emp.getEmpId() + "EmpFirstName: " +emp.getFirstName() + "EmpLastName is: " +emp.getLastName());
	}
	
	public void displayInfo(){
		
		EmpInfo emp3 = new EmpInfo(4,"Jessy","Juri");
		
		System.out.println("EmpId is: " + emp3.getEmpId() + "EmpFirstName: " +emp3.getFirstName() + "EmpLastName is: " +emp3.getLastName());
	}
	
	public  int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
