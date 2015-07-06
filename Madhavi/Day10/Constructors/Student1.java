
public class Student1 {
	
	int studentId;
	String firstName;
	String lastName;
	int scores[] = new int[6]; //= {35,45,56,77,89,67};
	
	Student1(){
		
		studentId = 1;
		firstName = "joe";
		lastName = "jack";
		int defaultArr[] = {75,75,75,75,75,75};
		scores = defaultArr;
		System.out.println("In default constructor of Student class");
		
	}
	
	Student1(int studentId,String firstName,String lastName){
		
		this();
		System.out.println("In parameterized constuctor of Student class");
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		display();
		
	}
	
	void display(){
		
		System.out.println("student Id is: " + studentId + " firstName is: " + firstName + " lastName is: " + lastName);
		
	}
	
	
	void calculateTotal(){
		int i,total=0,percentage=0;
		//int scores[] = {45,43,67,67,78,89};	
		for (i=0;i<6;i++){
			System.out.print(scores[i]+" ");
			total = total + scores[i];
			percentage = (total*100)/600;
			
		}
		
		System.out.println(" total score is: " + total +" percentage is: " + percentage);
		
	}

}
