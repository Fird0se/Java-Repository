package day16;

public class EmployeeGrade {
	
	
	private int empNo;
	private String empName;
	private float cust1Feedback;
	private float cust2Feedback;
	private float cust3Feedback;
	private float avgFeedback;
	private char grade;
	

	public void initializeEmp(int empNo,String empName,float cust1Feedback,float cust2Feedback,float cust3Feedback){
		this.empNo=empNo;
		this.empName= empName;
		this.cust1Feedback = cust1Feedback;
		this.cust2Feedback = cust2Feedback;
		this.cust3Feedback = cust3Feedback;
		
		System.out.println("empNo is: " + getEmpNo()+"\nempName is: " + getEmpName()+"\ncust1Feedback is: " + getCust1Feedback()+
													 "\ncust2Feedback is: " +getCust2Feedback()+"\ncust3Feedback is: " +getCust3Feedback());
	}
	
	
	public void initializeEmp(int empNo,String empName,float cust1Feedback,float cust2Feedback){
		
		this.empNo=empNo;
		this.empName= empName;
		this.cust1Feedback = cust1Feedback;
		this.cust2Feedback = cust2Feedback;
		System.out.println("empNo is: " + getEmpNo()+"\nempName is: " + getEmpName()+"\ncust1Feedback is: " + getCust1Feedback()+
				 "\ncust2Feedback is: " +getCust2Feedback());
		
	}
	
	public void calculateAvgFeedback(){
		avgFeedback = (cust1Feedback + cust2Feedback + cust3Feedback)/3;
		System.out.println("avarage feedback is: " + avgFeedback);
		
		
	}
	
	public void grade(){
		
		if( avgFeedback < 2){
			grade = 'C';
			System.out.println(" grade is " + grade);
		}
		else if( avgFeedback >= 2 && avgFeedback <=3 ){
			grade = 'B';
			System.out.print("grade is " + grade);
		}
		else if( avgFeedback >=3 && avgFeedback <=5){
			
			grade = 'A';
			System.out.print("grade is" + grade);
		}
		
	}
	public void display(){
		
		
	}
	
	public int getEmpNo() {
	return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getCust1Feedback() {
		return cust1Feedback;
	}

	public void setCust1Feedback(float cust1Feedback) {
		this.cust1Feedback = cust1Feedback;
	}

	public float getCust2Feedback() {
		return cust2Feedback;
	}

	public void setCust2Feedback(float cust2Feedback) {
		this.cust2Feedback = cust2Feedback;
	}

	public float getCust3Feedback() {
		return cust3Feedback;
	}

	public void setCust3Feedback(float cust3Feedback) {
		this.cust3Feedback = cust3Feedback;
	}

	/*public float getAvgFeedback() {
		return avgFeedback;
	}

	public void setAvgFeedback(float avgFeedback) {
		this.avgFeedback = avgFeedback;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}*/



	}
