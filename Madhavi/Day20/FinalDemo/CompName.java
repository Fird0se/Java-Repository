package package18;

public class CompName {
	//public final class CompName extends CompDetails{
	
		private String companyName;
		private final int MIN_SALARY = 4000;
		
		
		public CompName(String companyName){
			//super(companyName, location, zipcode);
			this.companyName = companyName;
		}
		
		public void myMethod(){
		//public final void myMethod(){
			
			System.out.println("CompanyName is: " +getCompanyName() + "salary is: " + MIN_SALARY);
			
			
		}
		
		public String getCompanyName() {
			return companyName;
		}


		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		

	}


