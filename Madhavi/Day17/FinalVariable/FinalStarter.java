package package15;

public class FinalStarter {

	public static void main(String[] args) {
		
		FinalDemo ob1 = new FinalDemo();
		ob1.display();
		System.out.println("fName is: " + ob1.getfName() + " lName is: " + ob1.getlName()+ " RollNo is: " + ob1.ROLL_NO);
		
		FinalDemo ob2 = new FinalDemo("Joe", "Jhon");
		System.out.println("fName is: " + ob2.getfName() + " lName is: " + ob2.getlName()+ " RollNo is: " + ob1.ROLL_NO);

	}

}
