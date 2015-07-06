package package25a;

public abstract class EmpInfo {
	
	private int empId;
	private String empName;
	
	
	public EmpInfo(int empId,String empName,int sal){
		this.empId = empId;
		this.empName = empName;
		
	}
	
	public abstract int getBonus();
	
	public void display(){
		
		System.out.println("EMPID: " + getEmpId() + "EMPNAME: " + getEmpName());
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
