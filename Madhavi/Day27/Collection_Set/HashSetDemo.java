package package27.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<String>();
		
		set.add(new String("Hi"));
		set.add(new String("Welcome"));
		set.add(new String("to"));
		set.add(new String("Hi"));
		set.add(new String("Java"));
		System.out.println("Initial Size is: " + set.size());
		
		System.out.println("In HASHSET no guarantee on order of elements");
				
		set.remove("to");
				
		Iterator ir =  (Iterator) set.iterator();
		
		while ( ir.hasNext()){
			
			System.out.println(ir.next());
		}
		
		System.out.println("Now the size is: " + set.size());
		System.out.println("Is it empty: " + set.isEmpty());
		System.out.println("Is the set contain D :" + set.contains("to"));
				
		Object[] array= set.toArray();					 
	       System.out.print("Content of Array:");
	       for(Object c: array){
	           System.out.print(c + " , ");
	       }
			
	}

}
