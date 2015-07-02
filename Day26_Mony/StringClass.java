package Day24;

public class StringClass {

	/*
	 * String s = new String(); String(char[] charArray) String(char[]
	 * charArray, int startIndex, int numChars); String(String obj);
	 * String(StringBuilder strBuilderObj);
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arrayString = { 'a', 'b', 'c', 'd', 'e', 'f' };

		String s1 = new String(arrayString);

		System.out.println("Array String = " + arrayString);
		System.out.println(s1);
		System.out.println("to string = " + s1.toString());
		System.out.println("CharAt = " + s1.charAt(3));
		System.out.println(s1.toCharArray());
		System.out.println("length = " + s1.length());

		String s2 = new String("how are you");
		System.out.println();
		System.out.println(" S2");
		System.out.println("Length = " + s2.length());
		System.out.println(" s2 Equals s1 = " + s2.equals(s1));
		System.out.println(" s2 Equals ignore case s1 = "
				+ s2.equalsIgnoreCase(s1));
		System.out.println("Endswith = " + s2.endsWith("you"));

		String s3 = new String("How are you");

		System.out.println(" s3 = " + s3);
		System.out.println("s3 equals s2 = " + s3.equals(s2));
		System.out.println("s3 Equal ignore case s1 = "
				+ s3.equalsIgnoreCase(s1));
		System.out.println("Startswith = " + s1.startsWith(s1));
		System.out.println("CompareTo = " + s3.compareTo(s2));
		System.out.println(s3.compareToIgnoreCase(s2));
		//System.println("compare ignorecase = " + s3.compareToIgnoreCase(s2));
		System.out.println();

		String s4 = new String("How are you");
		System.out.println("s4 = " + s4);
		System.out.println("StartsWith = " + s4.startsWith("How"));
		System.out.println("IndexOf = " + s4.indexOf("How are you"));
		System.out.println("lastIndexOf = " + s4.lastIndexOf("are"));
		System.out.println("subString(int start indexOf) = " + s4.substring(5));
		System.out.println();
		System.out.println();

		String s5 = new String("hello");
		System.out.println("Concat = " + s5.concat(s2));
		System.out.println("replace = " + s5.replace("hello", "how"));
		System.out.println(s5);
		System.out.println("Trim = " + s5.trim());
		System.out.println("char sequence s3 and s4 = " + s3.contains(s4));
		System.out.println("char sequence s3 and s5 = " + s3.contains(s5));
		
		
		System.out.println();
		
		String s=new String();
		s="how are you";
		System.out.println(s.charAt(0));
		

	}
}
