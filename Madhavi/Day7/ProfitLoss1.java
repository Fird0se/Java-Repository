				// Method with argument with return type


import java.util.Scanner;


public class ProfitLoss1 {

	public static void main(String[] args) {
		 int cp, sp;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Cost Price: ");
	        cp = sc.nextInt();
	        System.out.print("Enter Sale Price: ");
	        sp = sc.nextInt();
	        int r = myMethod(cp,sp);
	               
	}
	      
	public static int myMethod(int cp,int sp) {
	        int r = 0;
	        if (sp == cp) {
	          
	        	System.out.println( "Neither profit nor loss");  
	        }  
	        else if (sp > cp) {								
	        	r = sp - cp;
	      
	        	System.out.println( r +" $ profit happend");  
	        }  
	        else {
	        	r = cp - sp;   
	        	
	            System.out.println( r + " $ Loss happend");
	        }
	        return r; 
	} 
}


	