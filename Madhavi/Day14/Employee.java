package package14.one;

public class Employee {
private int salary;
	
	public Employee(int sal){
		salary = sal;
		System.out.println(" In the Super Class Default Constructor" + sal);
	}
	
	public void display(){
		
		System.out.println(" Salary in Super Class is: " + salary);
	}

}
