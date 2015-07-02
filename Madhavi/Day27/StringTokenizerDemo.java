package package27;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		String s = "Hello,World";
		StringTokenizer str = new StringTokenizer(s);			//StringTokenizer(String str) constructor
		
		System.out.println("Is it have more tokens: " + str.hasMoreTokens());		
		System.out.println("Total Tokens are: " + str.countTokens());
		
		System.out.println("String after delim is: " + str.nextToken(","));      //nextToken(delim) method
		System.out.println("Is it have more elements: " + str.hasMoreElements());
		System.out.println("Next element is: " + str.nextElement());
		
		
		String url = " https://github.com/Fird0se/java-repository/tree/master/Day26_Madhavi";
		
		StringTokenizer st = new StringTokenizer(url, "://./-_"); //StringTokenizer(str,delim) constructor
		
		while (st.hasMoreTokens())
		{
		    System.out.println(st.nextToken());
		}
		
		
	}

}
