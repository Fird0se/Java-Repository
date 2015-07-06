package package21;

public class ObjClassDemoStarter {

	public static void main(String[] args) {
		
		Object object;
		
		ObjClassDemo ob1 = new ObjClassDemo();
		
		ObjClassDemo ob2 = new ObjClassDemo(1, "Teddy", 94087);
		
		ObjClassDemo ob3 = new ObjClassDemo();
		
		object = new ObjClassDemo(2, "Denny", 94089);
		
		ob3 = ob2;
		
		ob2 = new ObjClassDemo(3,"Donny", 56478);
		
		System.out.println(ob3.equals(ob2));
		
		System.out.println(ob1.equals(object));
		
		System.out.println(object.toString());
		
		System.out.println(ob2.getClass());
		
		System.out.println(ob3.hashCode());
		
		System.out.println(ob1.equals(ob3));
		
		System.out.println(ob1.equals(ob2));
		
		System.out.println(ob1.equals(null));
		ob2 = ob3 = null;
		
		System.out.println(ob1.equals(ob3));
	}

}
