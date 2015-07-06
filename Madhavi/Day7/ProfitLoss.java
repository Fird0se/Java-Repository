			// Method with argument with no return value

import java.util.Scanner;
 
public class ProfitLoss {
 
        public static void main(String args[]) {
  
        double cp, sp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        cp = sc.nextDouble();
        System.out.print("Enter Sale Price: ");
        sp = sc.nextDouble();
        
        myMethod(cp,sp);
       
        }
        
        public static void myMethod(double cp,double sp) {
        if (sp == cp) {
            System.out.println( "Neither profit nor loss");  
        }  
        else if (sp > cp) {								
        	System.out.println( "Profit happend");  
        }  
        else {
        	System.out.println( "Loss happend");
        }
        
    } 
} 


