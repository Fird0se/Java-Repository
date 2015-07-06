								//  Method no arguments and no return type 


import java.util.Scanner;


public class PrimeNumbers1 {

	public static void main(String[] args) {
		/*int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number: ");
		n = input.nextInt();*/
		
		primeNumber();
		
	}
		
		public static void primeNumber(){
						
			int n = 20;
			
			System.out.println("prime numbers upto " + n + " are");
			for (int i = 2; i <= n; i++)  	   
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
		}
	}


