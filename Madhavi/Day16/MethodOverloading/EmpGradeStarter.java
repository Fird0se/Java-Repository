package day16;

public class EmpGradeStarter {

	public static void main(String[] args) {
		
		
		EmployeeGrade ob1 = new EmployeeGrade();
		ob1.initializeEmp(1, "Jordan", 3.25f, 4.50f, 5.0f);
		ob1.calculateAvgFeedback();
		ob1.grade();
		System.out.println(" ");
		
		EmployeeGrade ob2 = new EmployeeGrade();
		ob2.initializeEmp(2, "jessie", 4.0f,2.50f);
		ob2.calculateAvgFeedback();
		ob2.grade();
		
	}

}
