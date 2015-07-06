
public class StaticDemoStarter {

	public static void main(String[] args) {
		
		StaticDemo ob1 = new StaticDemo();								// static var directly initialize here 11 1000
		
		
		StaticDemo ob2 = new StaticDemo();							// 12 and 1000
		
		
		
		System.out.println("INITIAL VALUES: ");
		System.out.println("NoOfStudents are : " + ob1.noOfStudents + " Course fee is: " + ob1.courseFee);  
		
		ob2.staticMethod();												// Initializing Static Method
		System.out.println("MODIFIED VALUES: ");
		System.out.println("NoOfStudents are : " + ob2.noOfStudents + " Course fee is: " + ob2.courseFee); // 12 2000
		
		StaticDemo ob3 = new StaticDemo();
		System.out.println(ob3.noOfStudents + " " + ob3.courseFee);  // 13 2000
		
		
	}

}
