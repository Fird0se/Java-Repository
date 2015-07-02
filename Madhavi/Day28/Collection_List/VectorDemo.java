package package27.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		  Vector v = new Vector(3, 2);
		  
	      System.out.println("The Vector class implements a growable array of objects");
	      System.out.println("Default size for Vector is 10");
	      System.out.println("Elements are in insertion order");
		  
	      System.out.println("Initial size: " + v.size());
	      System.out.println("Initial capacity: " + v.capacity());
	      
	      v.addElement(new Integer(1));
	      v.addElement(new String("Hi"));
	      v.addElement(new Integer(2));
	      v.addElement(new Integer(7));
	      
	      System.out.println("Capacity after four additions: " + v.capacity());

	      v.addElement(new Double(5.45));
	      
	      System.out.println("Current capacity: " + v.capacity());
	      
	      v.addElement(new Double(6.08));
	      v.addElement(new Integer(7));
	      
	      System.out.println("Current capacity: " + v.capacity());
	      System.out.println("Current size is: " + v.size());
	      
	      System.out.println("First element: " + (Integer)v.firstElement());
	      System.out.println("Last element: " + (Integer)v.lastElement());
	      
	      if(v.contains(new Integer(3)))
	         System.out.println("Vector contains 3.");
	      
	      Iterator ir1 = v.iterator();
			
			while(ir1.hasNext()){
				System.out.println(ir1.next());
			}
	  }

}
