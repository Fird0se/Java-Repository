package package14.one;

public class Trainee {
	
	int salary = 5000;
	private String fName;
	private String lName;
	private int physics = 67;
	private int maths = 78;
	private int chemistry =67;
	
		
	public Trainee (String fName,String lName){
		
		this.fName = fName;
		this.lName = lName;
		System.out.println("In SuperClass Constructor");
		
	}
	
	public int score(){
		int score =(( physics+chemistry+maths)* 100)/300;
		System.out.println("In SuperClass Method" + " \n score is: " + score);
		return score;
		
	}
	
	public void displaySalary(){
		
		System.out.println("In SuperClass Salary is: " + getSalary());
	}
	
	
	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
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
