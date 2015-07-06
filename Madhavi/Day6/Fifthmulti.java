import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fifthmulti {

	public static void main(String[] args) throws IOException {
		      int n, c;
		      System.out.println("Enter an integer to print it's multiplication table");
		      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  	  n=Integer.parseInt(br.readLine());
		      System.out.println("Multiplication table of "+n+" is :");
		 
		      for ( c = 1 ; c <= 10 ; c++ )
		         System.out.println(n+"*"+c+" = "+(n*c));
		   }
		}

	


