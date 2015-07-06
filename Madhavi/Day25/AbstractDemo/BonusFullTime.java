package package25a;

public class BonusFullTime extends EmpInfo{
	
	private int sal;
	
	public BonusFullTime(int empId, String empName, int sal) {
		
		super(empId, empName, sal);
		this.sal = sal;
		
	}

	@Override
	public int getBonus() {
		int bonus = 3000;
		sal = sal+bonus;
		System.out.println("Bonus in BonusFullTime Class is: " + sal);
		return sal;
		
	}
	public void display(){
		super.display();
		System.out.println("Sal is: " + getSal());
	}


	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	

}
