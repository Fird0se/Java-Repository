package day24;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b = new StringBuffer("Hello how are you");
		System.out.println(b);

		StringBuffer b1 = new StringBuffer("Hello how are you");
		b1.setCharAt(4, 'h');
		System.out.println(b1);

		StringBuffer b2 = new StringBuffer("Hello how are you");

		b2.setLength(5);
		System.out.println(b2);

		StringBuffer b3 = new StringBuffer("Hello how are you");
		b3.reverse();
		System.out.println(b3);
		
	
	}

}
