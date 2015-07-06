package package27.Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		System.out.println("In SORTEDSET elements are in the order of asending");
		System.out.println("TreeSet is the class which implement SORTEDSET");
		
		s.add(new Integer(4));
		s.add(new Integer(5));
		s.add(new Integer(3));
		s.add(new Integer(4));
		s.add(new Integer(0));
		
		Iterator it =  (Iterator) s.iterator();
		
		while ( it.hasNext()){
			
			System.out.println(it.next());
		}
		
		
		SortedSet s1 = new TreeSet();
		s1.add(new String("Hello"));
		
		SortedSet s2 = s1;		
		System.out.println("First: " + s.first());			
		System.out.println("Last: " + s.last());			
		System.out.println("Is s2 equals s1: " + s2.equals(s1));
		
		s1.add(new String("Java"));
		System.out.println("Size of s1 is: " + s1.size());
		System.out.println("Class is : " + s1.getClass() );
	}

}
