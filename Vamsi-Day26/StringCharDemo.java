
public class StringCharDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		//String(char chars[ ])
		
		char chars[] = { 'a', 'b', 'c' };
		
		String s = new String(chars);
		
		System.out.println(s);
	
		//String(char chars[ ], int startIndex, int numChars)
	
		char chars1[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		
		String s1 = new String(chars1, 2, 3);
		
		System.out.println(s1);
	

}}
