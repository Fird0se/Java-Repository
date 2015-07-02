package Day24;

public class StringBufferClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer("How are you");
		System.out.println(s1);
		System.out.println("length = "+s1.length());
		System.out.println("Capacity = "+s1.capacity());
		System.out.println();
		
		StringBuffer s2 = new StringBuffer("Hello");
		System.out.println("---"+s2.capacity());
		System.out.println("capacity = "+s2.capacity());
		System.out.println("setLength = "+s2.charAt(3));
		
		StringBuffer s3 =new StringBuffer("Hellos");
		
		System.out.println("substring - = "+s3.substring(2));
		System.out.println("reverse = "+s3.reverse());
		System.out.println("substring = "+s3.substring(2));
		
		StringBuffer s4 =new StringBuffer("HHHHHHH");
		s4.setLength(5);
		System.out.println(s4);
		s4.setCharAt(3,'C');
		System.out.println("char "+s4);
		
		
	}

}
