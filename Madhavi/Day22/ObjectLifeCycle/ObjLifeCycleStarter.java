package package20;

public class ObjLifeCycleStarter {

	public static void main(String[] args) {
		
		BankObjLifeCycle bank1;									// STEP1: creating 1 new instance/reference
		
		bank1 = new BankObjLifeCycle();							// STEP2: pointing a reference to an obj of BankObjLifeCycle
		
		BankObjLifeCycle bank2 = new BankObjLifeCycle(100,"BOFA","Sanjose");
		
		bank2 = new BankObjLifeCycle(101, "CHASE", "PaloAlto"); // STEP3: dereferencing an obj (1st obj of bank2)
		
		
		BankObjLifeCycle bank3 = new BankObjLifeCycle(102, "CITI", "MountainView");		// STEP4: Garbage Collection
		
		bank3 = new BankObjLifeCycle(103, "BOFA", "Sunnyvale");		
	}

}
