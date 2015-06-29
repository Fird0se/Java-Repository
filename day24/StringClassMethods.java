package day24;

public class StringClassMethods {

	public static void main(String[] args) {
		String s = "Hello how are you";
		char c = s.charAt(1);
		System.out.println(c);

		String s1 = "Hello";
		int x = s.compareTo(s1);// compares the value//compareToIgnorecase can
								// be used to ignore case sensitive letters
		System.out.println(x);

		String s2 = s.concat(s1);
		System.out.println(s2);

		boolean b = s.contains("how");
		System.out.println(b);

		String s3 = "hello how are you";
		boolean b1 = s.equals(s3);
		System.out.println(b1);

		boolean b2 = s.equalsIgnoreCase(s3);
		System.out.println(b2);

		boolean b3 = s3.startsWith("hello");
		System.out.println("b3");

		boolean b31 = s3.startsWith("how", 6);
		System.out.println(b31);

		boolean b32 = s3.endsWith("you");
		System.out.println(b32);

		char[] arr = s3.toCharArray();
		System.out.println(arr);

		int y = s3.length();
		System.out.println(y);

		String s31 = " Hello how are you ";

		String s4 = s31.trim();
		System.out.println(s4);

		int z = s3.indexOf("h");
		System.out.println(z);

		int z1 = s3.indexOf("h", 5);
		System.out.println(z1);

		int z11 = s3.lastIndexOf("you");
		System.out.println(z11);

		String s5 = s3.replace("e", "i");
		System.out.println(s5);

		String s6 = s3.substring(5);
		System.out.println(s6);

		String s61 = s3.substring(5, 10);
		System.out.println(s61);

	}

}
