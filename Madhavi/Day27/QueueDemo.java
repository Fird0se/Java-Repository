package package27.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<String>();
		qu.add("H");
		qu.add("G");
		qu.add("D");
		qu.add("D");
		qu.add("K");
		
		System.out.println("LinkedList gives us elements in insertion order");
		System.out.println("Queue will allow duplicate values");
		System.out.println("---LinkedList---");
		System.out.println("Size of queue is: " + qu.size());
		
		Iterator it = (Iterator) qu.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
		System.out.println("peek is: " + qu.peek());
		System.out.println("Equals method: " + qu.equals(null));
		System.out.println("poll is: " + qu.poll());
		System.out.println(qu);
		System.out.println();
		
		System.out.println("---PriorityQueue---");
		Queue<Character> qu1 = new PriorityQueue<Character>();
			
		qu1.add('H');
		qu1.add('G');
		qu1.add('D');
		qu1.add('Y');
		qu1.add('K');
		
		System.out.println("No gurantee in order of elements");
		System.out.println("Size of queue is: " + qu1.size());
		System.out.println("Equals method: " + qu.equals(qu1));
		System.out.println("Is the element is added to queue: " + qu1.offer('Z'));
		System.out.println("Size of queue is: " + qu1.size());
		
		
		Iterator it1 = (Iterator) qu1.iterator();
		
		while(it1.hasNext()){
			
			System.out.println(it1.next());
		}
		
		System.out.println("Removing the element: " + qu1.poll());
	
	}

}
