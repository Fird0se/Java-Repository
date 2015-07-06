import java.util.Scanner;


public class Array2 {

	public static void main(String[] args) {
		int index, num, search, array[];
	      
		  Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 
	      array = new int[num]; 
	      
	      System.out.println("Enter elements: ");
	      for (index = 0; index < num; index++)			
	      array[index] = input.nextInt();

	      System.out.println("Enter the search value:");
	      search = input.nextInt();

	      for (index = 0; index <num; index++)
	      {
	         if (array[index] == search) 
	         {
	           System.out.println(search +" is present at index "+index);
	           break;
	         }
	      }
	      if (index == num){
	    	  System.out.println("value does't exist");
	      }
	}

}
