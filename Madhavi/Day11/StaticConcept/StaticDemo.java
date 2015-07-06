
public class StaticDemo {
	
	public static int noOfStudents;							// Static Variables
	public static int courseFee;
	
	static {												// Static Block
		noOfStudents = 10;
		courseFee = 1000;
		
	}
	
	public StaticDemo(){
		noOfStudents++;
	}
	
	public static void staticMethod(){						// Static Method
		 
		 courseFee = 2000;
		
	}

}
