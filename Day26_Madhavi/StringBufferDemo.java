package package25a;

public class StringBufferDemo {

	public static void main(String[] args) {
		
				
		StringBuffer str = new StringBuffer();
		System.out.println("Length is: " + str.length());
		
		str = new StringBuffer("This is StringBuffer Class");
		System.out.println(str.length());							// length() method
		
		System.out.println(str.capacity());							//capacity() method
		
		StringBuffer str1 = new StringBuffer(str);
		System.out.println(str1);
		
		str.setLength(20);											//setLength() method
		System.out.println("Now str is: " + str);
		System.out.println("Char at 9: " +str.charAt(9) ); 			//charAt() method
		str.setCharAt(19, 's');
		System.out.println(str);
		str.setCharAt(19, 'r');									//setCharAt() method
		System.out.println(str);
		
		StringBuffer str2 = new StringBuffer(12321);
		if ( str2.equals(str2.reverse())){
			
			System.out.println("given number is palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		
		System.out.println(str.substring(5));					// substring() 
		System.out.println(str.append(" Hello"));					// append()
		System.out.println(str.codePointAt(2)); 				//codePointAt() : gives Unicode at specified index	
		str.deleteCharAt(4);										//delete() method
		System.out.println("After deleting char at index 4: " + str);
		str.insert(4, ' ');										// insert()
		System.out.println(str);
		
		
		
	}

}
