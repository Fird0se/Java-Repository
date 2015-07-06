
public class GettersSetters {
	
	int StudentId;
	String firstName;
	String lastName;
	
	GettersSetters(){
		
	}
	
	GettersSetters(int stuId,String fName,String lName){   			//parameterized constructor
		this.StudentId = stuId;
		this.firstName = fName;
		this.lastName = lName;
		
	}
	
	void display(){
		System.out.println("your id is: " + getStudentId() +" your firstName is: " + getFirstName() +" your lastName is: " + getLastName());
	}
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

	