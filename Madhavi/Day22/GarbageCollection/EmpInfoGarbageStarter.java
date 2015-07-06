package package20;

public class EmpInfoGarbageStarter {

	public static void main(String[] args) {
		
		EmpInfo emp1 = new EmpInfo();
		
		
		EmpInfo emp2 = new EmpInfo(1, "David", "Dustin");
		
		emp1 = new EmpInfo(2, "Jonny", "Stuffins"); // the first obj for emp1 will be garbaged at this point
		
		emp2 = new EmpInfo();	// the first obj for emp2 will be garbaged at here
		
		
		emp2 = new EmpInfo(3, "Denny", "Carls"); // second obj for emp2 will be garbaged
		
		emp2.displayInfo();
		
	}
	

}
