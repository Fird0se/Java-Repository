package package27.List;

import java.util.*;


public class ArrayListDemo {
   
	public static void main(String args[]) {
     
	  ArrayList<String> al = new ArrayList<String>();
	  
	  System.out.println("Elements will place in insertion order");
	  System.out.println("List will allow duplicate values");
      System.out.println("Initial size of al: " + al.size());

      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("A");
      al.add(1, "G");
      System.out.println("Size of al after additions: " + al.size());

      System.out.println("Contents of al: " + al);
      
      al.remove("B");
      al.remove(2);
      
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
      System.out.println("Index is: " + al.indexOf("E"));
      System.out.println("Is it empty: " + al.isEmpty());
   }

}
