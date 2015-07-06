					// method with no value with return type

public class ProfitLoss3 {

	public static void main(String[] args) {
		 myMethod();
         
    }
    
		public static int myMethod() {
		int r = 0;
		int cp=40,sp=40;
	
		if (sp == cp) {
      
			System.out.println( "Neither profit nor loss");  
		}  
		else if (sp > cp) {								
    	
			r = sp - cp;
      		System.out.println( r +" $ profit happend");  
		}  
		else {
			
			r = cp - sp;      
			System.out.println( r + " $ Loss happend");
        }
		return r;
	}
} 





