package package14.one;

public class Employee1 extends Trainee {
	
	private int salary;
	private int id;
	private String location;
	
	public Employee1(String fName,String lName,int id,String location,int salary){
		
		super(fName,lName);													// super() to call SuperClass Constructor
		this.id = id;
		this.location = location;
		this.salary = salary;
		System.out.println("In SubClass Constructor");
	}
	
	public int score(){
		int score = super.score();											// super() to call SuperClass Method
		System.out.println("In SubClass Method");
		return score;
	}
	
	public void displaySalary(){
		
		super.displaySalary();
		System.out.println("super variable "+super.getSalary());			// super() to call SuperClass Variable
		//System.out.println(" In SubClass Variable Salary is : "+sal);		
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
