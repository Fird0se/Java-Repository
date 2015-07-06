package package14.one;

public class TraEmpStarter {

	public static void main(String[] args) {
		
		Employee1 ob1 = new Employee1("joe", "jhon", 1, "California",2000);
		System.out.println("fName is: " + ob1.getfName() + "\nlName is: " + ob1.getlName()+ "\nId is : " + ob1.getId() + "\nLocation is: " + ob1.getLocation()
																								+ "\nsalary is : " +ob1.getSalary());
			
		ob1.score();
		
		ob1.displaySalary();
		
		Trainee ob2 = new Trainee("daisy", "dunkin");
		System.out.println("fName is: " + ob2.getfName() + "\nlName is : " + ob2.getlName()+"\nsalary is: " +ob2.getSalary());
	
	}

}
