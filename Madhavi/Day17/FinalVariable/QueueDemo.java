package package15;

public class QueueDemo {
	
	 private static final int size = 3;  
	 int arr[] = new int[size];  
	// int size = 0;  
	 int top = -1;  
	 int rear = 0;  
	  
	 public void push(int element) {  
		 if (top < size - 1) {  
		 top++;  
		 arr[top] = element;  
		 System.out.println(element  + " is pushed to Queue");  
		 display();  
		 } 
		 else {  
			 System.out.println("Queue is full");  
		 }  
	  
	 }  
	  
	 public void pop() {  
		 if (top >= rear) {  
		 rear++;  
		 System.out.println("Pop operation done");  
		 display();  
		 }
		 else {  
			 System.out.println("No Elements");  
		 }  
	 }  
	  
	 public void display() {  
		 if (top >= rear) {  
		 System.out.println("Elements in Queue : ");  
		 for (int i = rear; i <= top; i++) {  
			 System.out.println(arr[i]);  
	     }  
	    }  
	 }  

}
