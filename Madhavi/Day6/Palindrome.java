import java.text.ParseException;
import java.util.Scanner;


public class Palindrome {

		public static void main(String[] args) throws ParseException {
	    String word;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a string to check if it is a palindrome");
	    word = in.nextLine();
	    System.out.println(palindromeChecker(word));
	}
	public static String palindromeChecker(String word){
	    int length = word.length();
	    String reverse="";
	    for ( int i = length - 1 ; i >= 0 ; i-- )
	        reverse = reverse + word.charAt(i);
	    if (word.equals(reverse))
	        return "Palindrome";
	    else
	        return "Not a Palindrome";
	}
}