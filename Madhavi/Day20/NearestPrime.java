package package18;
import java.util.Scanner;

public class NearestPrime {

	public static void main(String[] args) {
		
		System.out.println("enter num");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        smallPrime(a);
        isPrimeNumber(a);
	}    
        
        public static void smallPrime(int a){
		        int  i, j;
		        
		        for (j = a - 1;; j--) 
		        {
		            for (i = 2; i < j; i++) 
		            {
		                if (j % i == 0)
		                break;
		            }
		              if (i == j) 
		             {
		                 System.out.println(j);
		                 break;
		             }
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
	


