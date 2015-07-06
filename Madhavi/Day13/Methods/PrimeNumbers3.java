								// Method with no value and with return type


public class PrimeNumbers3 {

	public static void main(String[] args) {
		
		myMethod();	

	}

	
	public static int myMethod(){
		
		int n = 78;
		System.out.println("prime number upto " + n + " are");
		for ( int i =2; i<n;i++){
			
			for ( int j=2;j<=i;j++){
				
				if(j==i){
					System.out.println(i);
				}
				
				if(i%j == 0){
					break;
				}
			}
			
		}
		return n;
	}
}
