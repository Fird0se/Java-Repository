import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Switch{
  
     public static void main(String[]args) throws IOException{     
    	char vowel;
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter alphabet:" ); 
        vowel=sc.next().charAt(0);
    	
    	switch (vowel){   
        case 'a':      
        case 'e':          
        case 'i':         
        case 'o':         
        case 'u':     
        	System.out.println(vowel + " : is a vowel");
        	break;
        default:
        	System.out.println(vowel + " : is not a vowel");
        	break;

        }
    } 
}