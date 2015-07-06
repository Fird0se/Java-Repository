package package15;

public class StackArray {
	
private int stack[];
	
	private int tos;
	
	public StackArray(int size) {
		stack = new int[size];
		tos = -1;
	}
	
	void push(int element){
		if(tos == (stack.length - 1))
			System.out.println("Stack is full !!!");
		else
			stack[++tos] = element;
	}
	
	int pop(){
		
		if(tos < 0){
			System.out.println("Stack is empty !! cannot delete an element from teh stack..");
			return 0;
		}
		else
			return stack[tos--];
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getTos() {
		return tos;
	}

	public void setTos(int tos) {
		this.tos = tos;
	}

}
