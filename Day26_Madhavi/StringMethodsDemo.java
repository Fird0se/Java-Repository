package package25a;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String str = new String("Welcome to JavaWorld");
		
		String str1 = new String();					// default constructor
		System.out.println(str1 + " It is empty");
		
		
		char[] myArray = {'j','a','v','a','c','l','a','s','s'};
		char[] myArray2 = {'j','a','v','a','C','L','a','s','s'};
		
		String str2 = new String(myArray);			// Char Array Constructor
		System.out.println(str2);
		
		String arr2 = new String(myArray2);
		System.out.println(arr2);
		
		String str3 = new String(myArray, 2, 3);	// (char,int start index,int no.of chars Constructor
		System.out.println(str3);
		
		String str4 = new String(str2);            // Object constructor
		System.out.println(str4);
		
		System.out.println("Length of String is: " + str2.length()); 	//String length() method
		System.out.println("Char at index 5 is: " + str2.charAt(5));	//String charAt() method
		System.out.println("SubString between 2 to 7: " + str2.substring(2, 7)); // subString() method
		
		char[] array= str.toCharArray();					 //toCharArray() method
	       System.out.print("Content of Array:");
	       for(char c: array){
	           System.out.print(c + " , ");
	       }
		System.out.println("\n Is str1 is equals to arr2: " + str2.equals(arr2));  // equals() method
		
		System.out.println("Is str1 is equalsIgnoreCase to arr2:" + str2.equalsIgnoreCase(arr2));	//equalsIgnoreCase() method
		
		System.out.println("Index of s is: " + str2.indexOf('s'));				//index() method
		System.out.println("LastIndex of s is: " + str2.lastIndexOf('s'));		// lastIndexOf() method
		System.out.println("Repalcing: " + str.replace("Java", "Oracle")); 	//replace() method
		System.out.println("contains method: " + str.contains("World"));
		
		String str5 = new String("   Hello ");
		String str6 = str5.concat(str);						//concat() method
		System.out.println(str6);
		System.out.println("Triming str6: " + str6.trim());			// trim() method
		System.out.println("Compare Strings: " + str5.compareTo(str));
			
		if(str.startsWith("Ja") && str.endsWith("ss")){				// startsWith() and endsWith() method
			System.out.println("True");
		}
			else{
				System.out.println("False");
			}
		
		

	}

}
