						// Method with argument with return type

import java.util.Scanner;
			
public class PrimeNumbers2 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter number: ");
		n = input.nextInt();
		
		myMethod(n);
	}
		
	public static int myMethod(int n){
		int i;
		for (i = 2; i <= n; i++)  	   					
        { 		 		  
         		  
			for(int j =2; j<=i; j++)
			{
				if(j==i)
				{
					System.out.println(i);
				}
        	 
				if ( i % j ==0){
        		 break;
				}
			}
                  
       }	
		return n;
		
	}

}
