					// method with no value no return type

import java.util.Scanner;


public class ProfitLoss2 {

	public static void main(String[] args) {
		double cp, sp;
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        cp = sc.nextDouble();
        System.out.print("Enter Sale Price: ");
        sp = sc.nextDouble();*/
        //double r = myMethod();
        myMethod();
               
        }
        
	public static void myMethod() {
        int r = 0;
        int sp,cp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        cp = sc.nextInt();
        System.out.print("Enter Sale Price: ");
        sp = sc.nextInt();
       
		
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
        
    } 
} 