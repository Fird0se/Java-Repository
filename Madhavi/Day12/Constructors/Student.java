import java.util.Arrays;


public class Student {
	
	int studentId;
	String firstName;
	String lastName;
	 int[] scores;
	//int []scoresTemp = {56,78,56,45,88,99};
	//String arr1;
	
	Student(){
		
		this(2,"mark","jk");
		studentId = 1;
		firstName = "joe";
		lastName = "jack";
		//scores = scoresTemp;
		//arr1 = Arrays.toString(scores);
		System.out.println("In default constructor of Student class");
		
	}
	
	Student(int studentId,String firstName,String lastName){
		
		System.out.println("In parameterized constuctor of Student class");
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	void display(){
		
		System.out.println("student Id is: " + studentId + " firstName is: " + firstName + " lastName is: " + lastName 
																			+ " scores are: ");
		if(scores !=null){
			for(int i : this.scores){
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	
	void calculateTotal(){
		
		int i,total=0,percentage=0;
		//int scores[] = {45,43,67,67,78,89};
		if(scores != null){
		for (i=0;i<6;i++){
			total = total + scores[i];
			percentage = (total * 100 )/600;
			
		}
		
		System.out.println(" total score is: " + total +" percentage is: " + percentage);
		}
	}

}
