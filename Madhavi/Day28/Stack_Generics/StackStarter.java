package package27;

import java.util.Stack;

public class StackStarter {

	public static void main(String[] args) {
		
		
		StackGeneric<Integer> st = new StackGeneric<Integer>();

        st.push(5);
        st.push(7);
        st.push(10);
        
        System.out.println("Stack contains " + st.size() + " items.");
                
        while (!st.isEmpty()) {
            System.out.println("Poping the elements: " + st.pop());
        }

        if (st.size() == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contains " + st.size() + " items.");
        }
        
        st.push(7);
        
        System.out.println("Size: " + st.size());
        System.out.println("poping " + st.pop());
       
       
	}

}
