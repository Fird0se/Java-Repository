package package19;

public class StudentInfo {
	
	private static int studentId;
	private String studentName;
	private int score;
	
	public StudentInfo(){
		
		studentId++;
		System.out.println("In default Constructor");
		
	}
	
	public StudentInfo(String studentName,int score){
		
		//this.studentId = studentId;
		this.studentName =studentName;
		this.score = score;
		
		System.out.println("StudentId is: " + getStudentId() + "StudentName : " + getStudentName() + "Score is: " + getScore());
	}
	
	public void display(){
		
		System.out.println("StudentId is: " + getStudentId() + "StudentName : " + getStudentName() + "Score is: " + getScore());
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	

}
