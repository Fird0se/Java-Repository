package package27;

	import java.util.Vector;

	public class StackGeneric<E> {
	   
		private Vector<E> stack;
	    private int top = -1; 						

	    public StackGeneric() {
	        stack = new Vector<E>();
	    }

	    public void push(E obj) {
	        stack.add(obj);
	        top++;
	    }

	    public E pop() {
	        if (top == -1) {
	            return null; 						
	        }
	        E element = stack.get(top);
	        stack.remove(top);
	        top--;
	        return element;
	    }
	    
	    public boolean isEmpty(){
			return top == -1;
	    	
	    }
	    
	    public int size(){
	    	return top+1;
	    }
	  
}

