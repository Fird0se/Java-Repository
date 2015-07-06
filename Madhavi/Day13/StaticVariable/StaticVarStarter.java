
public class StaticVarStarter {

	public static void main(String[] args) {

		StaticVariable ob1 = new StaticVariable(); 					// Static Var initialize here itself
		System.out.println("empid is: " +ob1.empid);
		
		StaticVariable ob2 = new StaticVariable();
		ob2.StaticVariable1();
		System.out.println("empid is: " +ob2.empid);
		
		System.out.println(ob1.empid);
		
		
	}

}
