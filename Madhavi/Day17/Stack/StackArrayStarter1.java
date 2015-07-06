package package15;

public class StackArrayStarter1 {

	public static void main(String[] args) {
		

		StackArray myStack1 = new StackArray(4);
		StackArray myStack2 = new StackArray(8);
			
			for(int i=0;i<4;i++){
				myStack1.push(i);
			}
			
			for(int i=0;i<8;i++){
				myStack2.push(i);
			}
			
			System.out.println("Deleting elements from stack1...");
			for(int i=0;i<4;i++){
				System.out.println(myStack1.pop());
			}
			
			System.out.println("Deleting elements from stack2...");
			for(int i=0;i<8;i++){
				System.out.println(myStack2.pop());
			}

	}

}
