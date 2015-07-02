
public class StringDemo {
	
	public static void main(String args[]){
		String s = new String ("Hello World");
		
		char[] charArray = {'a','b','c','d','e','f'};
		
		System.out.println(charArray);
		
		s = new String(charArray);
		
		System.out.println(s.length());
		
		System.out.println(s);
		
		s=new String();
		System.out.println(s+"empty");
	}

}
