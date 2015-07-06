package package24;

public class WrapperClass {

	public static void main(String[] args) {
		
		Boolean bobj1 = new Boolean(false);
		Boolean bobj2 = new Boolean("True");
		
		boolean flag = bobj1.booleanValue();
		boolean flag1 = bobj2.booleanValue();
		System.out.println("Boolean bobj1: " +flag);
		System.out.println("Boolean bobj2: " +flag1);
		
		Byte byte1 = new Byte((byte) 17);						//boxing
		Byte byte2 = new Byte("15");
		System.out.println(" ");
		
		byte byteVar = byte1.byteValue();						//unboxing
		byte byteVar1 = byte2.byteValue();
		System.out.println("Byte byte1: " + byteVar);
		System.out.println("Byte byte2: " + byteVar1);
		System.out.println(" ");
		
		Integer iobj1 = new Integer(56);						//boxing
		Integer iobj2 = new Integer("544");
		
		int intVar = iobj1.intValue();							//unboxing
		int intVar1 = iobj2.intValue();
		System.out.println("Integer iobj: " + intVar);
		System.out.println("Integer iobj: " + intVar1);
		System.out.println(" ");
		
		Float fobj1 = 6.4555346f;								//AutoBoxing
		Float fobj2 = new Float(22.03678278f);
		Float fobj3 = new Float("12.0");
		
		float fVar1 = fobj1;									//AutoUnboxing
		float fVar2 = fobj2.floatValue();
		float fVar3 = fobj3.floatValue();
		System.out.println("Float fobj1: " + fVar1);
		System.out.println("Float fobj2: " + fVar2);
		System.out.println("Float fobj3: " + fVar3);
		System.out.println(" ");
		
		Double dobj1 = 23.5455547676;							//AutoBoxing
		Double dobj2 = new Double("12.457656756767");
		
		double dVar1 = dobj1;									//AutoUnboxing
		double dVar2 = dobj2.doubleValue();
		System.out.println("Double dobj1: " + dVar1);
		System.out.println("Double dobj2: " + dVar2);
		System.out.println(" ");
		
		Long lobj1 = new Long(233456784);
		Long lobj2 = new Long("34567");
		
		long lVar1 = lobj1.longValue();
		long lvar2 = lobj2.longValue();
		System.out.println("Long lobj1: " + lVar1);
		System.out.println("Long lobj2: " + lvar2);
		System.out.println();
		
		Short sobj1 = new Short((short) 3);
		Short sobj2 = new Short("23");
		
		short sVar1 = sobj1.shortValue();
		short sVar2 = sobj2.shortValue();
		System.out.println("Short sobj1: " + sVar1);
		System.out.println("Short sobj2: " + sVar2);

	}

}
