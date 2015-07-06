package day16;

import java.util.Scanner;

public class OddPrimeValue {

	public static void main(String[] args) {
		
		System.out.println("enter a number to check: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		oddNum(n);
		isPrimeNumber(n);
	}
	
	public static void oddNum( int n){
		 
		if ( n % 2 == 0){
			
			System.out.println("given number even number");
		}	
		else{
			System.out.println("given number is odd number");
		
		}
	}
	
			
				 
	public static void isPrimeNumber(int n){
		  int count =0;       
		  for(int i=2; i<n; i++){
			  if(n % i == 0){
			  count =1;
			  break;
			  }
		  } 
		  if(count == 1){
			  System.out.println("given number not prime number");
		  
		  }
		  else{
			  System.out.println("given number prime number");
		  }
	}
}



