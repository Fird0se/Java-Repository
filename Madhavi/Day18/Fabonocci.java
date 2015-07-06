package day16;

import java.util.Scanner;

public class Fabonocci {

	public static void main(String[] args) {
		
		int n;
		System.out.println("enter your number: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.println("Fabonocci series upto " + n + " are :-" );
		
		int initialNum = 0;
		int a=0;
		int b=1;
		int c=0;
		while(initialNum <= n){
		  
			c=b+a;
		    System.out.print(" " + c);
		    a=b;
		    b=c;
		        
		    initialNum++;
		}
		  
	}
}
		
		
