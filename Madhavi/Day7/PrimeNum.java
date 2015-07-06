import java.util.Scanner;
class PrimeNum
{
   public static void main (String[] args)
   {	
	   int i =0;
	   int J =0;
	   String  primeNumbers = "";
	   System.out.println("Enter the value of n:");
	   Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       
       System.out.println("Prime numbers from 1 to n are :");
      
       for (i = 2; i <= n; i++)  	   
        { 		 		  
         int C=0; 		  
         for(J =i; J>=1; J--)
         {
        	 if(i%J==0)
        	 {
        		 C = C + 1;
        	 }
         }
         if (C == 2)
         {
	       //primeNumbers = primeNumbers + i + " "; 
        	 System.out.println(i);
         }	
      }	
      
     // System.out.println(primeNumbers);
   }
}
	

