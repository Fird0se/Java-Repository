
public class Starter {

	public static void main(String[] args) {
		Account ob1 = new Account();
		Account ob2 = new Account();
		Account ob3 = new Account();
		Account ob4 = new Account();
		
		ob1.initializeMembers(01,100,10000);
		ob1.display();
		
		ob2.initializeMembers(02,200,20000);
		ob2.display();
		
		ob3.initializeMembers(03,300,30000);
		ob3.display();
		
		ob4.initializeMembers(04,400,40000);
		ob4.display();

	}

}
