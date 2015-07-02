package package27.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
	      LinkedList list = new LinkedList();
	      
	      System.out.println("In LinkedList elements will ordered in insertion order");
	      System.out.println("List will allow duplicate values");
	      
	      list.add("F");
	      list.add("B");
	      list.add("D");
	      list.add("E");
	      list.add("A");
	      list.addLast("Z");
	      list.addFirst("A");
	      list.add(3, "A2");
	      
	      System.out.println("Original contents of list: " + list);

	      list.remove(4);
	      System.out.println("Contents of list after deletion: " + list);
	      System.out.println("Size is: " + list.size());
	     
	      list.removeFirst();
	      list.removeLast();
	      System.out.println("list after deleting first and last: " + list);
	      System.out.println("Is list contain Z: " + list.contains("Z"));
	      
	      Iterator ir1 = list.iterator();
			
			while(ir1.hasNext()){
				System.out.println(ir1.next());
			}

	}

}
