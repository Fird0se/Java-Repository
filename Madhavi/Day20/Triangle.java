package package18;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		System.out.println(" enter the values: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if( (a+b)>c && (b+c)>a && (c+a)>b ){
			
			System.out.println("We can form a triangle");
		}
		else{
			System.out.println("We can't form triangle with this values");
		}
	}


}