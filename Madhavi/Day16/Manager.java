package package14.one;

public class Manager extends Employee {
	 private int salary = 4000;
		
		public Manager(){
			super(3000);
			//salary = sal;
			System.out.println(" In the Sub Class Default Constructor");
		}
		
		public void display(){
			
			System.out.println(" Salary in Sub Class is: " + salary);
		}
		

}
