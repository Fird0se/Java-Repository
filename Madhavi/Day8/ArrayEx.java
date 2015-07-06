import java.util.Scanner;


public class ArrayEx {

	public static void main(String[] args) {
		 int str;
		 int index;
		
		String firstName[] = new String[5];
		String lastName[] = new String[5];
		
		Scanner input = new Scanner(System.in);
	    System.out.println("how many elements: ");
	    str= input.nextInt(); 
	       
	      
	      System.out.println("Enter elements for firstName: ");
	      int n = str;
	      for (index = 0; index < n; index++)		
	      firstName[index] = input.next();
	      System.out.println(firstName[index]);
	      
	      
	      System.out.println("Enter elements for lastName: ");
	      for (index = 0; index < n; index++)			
	      lastName[index] = input.next();
	      System.out.println(lastName[index]);
	}	
}

