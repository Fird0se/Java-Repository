package package18;

import java.util.Scanner;

public class TimeDisplay {

	public static void main(String[] args) {
		
		int hr;
		int mn;
		int sec;
		
		System.out.println("Enter the time in seconds");
		Scanner scan = new Scanner(System.in);
		long s = scan.nextLong();
		
		hr = (int)(s/3600);
		int rem = (int)(s%3600);
		mn = rem/60;
		sec = rem%60;
		
		System.out.println(hr+ " hr "+mn+ " mn "+sec + "sec");
	}
}

	


