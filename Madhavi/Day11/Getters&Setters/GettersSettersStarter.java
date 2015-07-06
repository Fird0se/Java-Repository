
public class GettersSettersStarter {

	public static void main(String[] args) {
		
		GettersSetters ob1 = new GettersSetters();
		
		
		
		
		ob1.setStudentId(100);									//calling using getters and setters
		ob1.setFirstName("Joe");
		ob1.setLastName("Jhon");
		
		System.out.println(ob1.getStudentId() + " is ur id " + ob1.getFirstName() + " is ur firstName " + ob1.getLastName() + " is ur lastName ");
		
		
		GettersSetters ob2 =new GettersSetters(101,"dai","pj");			// calling parameterized constructor
		ob2.display();
		
		GettersSetters ob3 = new GettersSetters(102,"hy","you");				// calling parameterized constructor
		ob3.display();
		
		
		
	}
}

