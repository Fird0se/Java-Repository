package day16;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println("enter number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("sum of the digits for " + n + " is");
		
		int sum=0;
		while(n != 0){
		
			sum += n%10;
			n = n/10;
		}	
			System.out.println(sum);
			
		
	}

}
