							//  Method with arguments and no return type 


import java.util.Scanner;


public class PrimeNumbers {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number: ");
		n = input.nextInt();
		
		primeNumber(n);
		
	}
		
		public static void primeNumber(int n){
			
			
			for (int i = 2; i <= n; i++)  						// loop for initiating i from 2 to given number	   
	        { 		 		  
	         		  
				for(int j =2; j<=i; j++)						// given num divide by the number itself
				{
					if(j==i)									// if j=i it prints that num in i
					{
	        		 System.out.println(i);
					}
	        	 
					if ( i % j ==0){							// if it gives remainder as 0 then its not prime..it will break
	        		break;
					}
				}
	                  
	        }	
		}
}
		
