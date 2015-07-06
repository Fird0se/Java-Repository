package package19;

public class StudentInfoStarter {

	public static void main(String[] args) {
		// int i; this is stored in stack because it is a local var
		
		StudentInfo ob1;  													// creating 1 instance/reference stored in stack  
		ob1 = new StudentInfo();											//creating object to the StudentInfo class stored in heap
		
		StudentInfo ob2 = new StudentInfo( "Krish", 360); 					//heap contains obj of StudentInfo(krish,360)
														  					// whereas stack contain reference for it(ob2)
		
		StudentInfo ob3 = new StudentInfo();								//new reference ob3 stored in stack and obj of StudentInfo stored in a heap
		
		ob1 = new StudentInfo("Anne", 320); 								// creating new obj(stored in heap) for ob1 reference
		
		StudentInfo ob4;													// creating 1 new instance ob4 which is stored in stack
		
		ob4 = null;
		//ob4.display();
		ob4 = ob2;
		
		

	}

}	
