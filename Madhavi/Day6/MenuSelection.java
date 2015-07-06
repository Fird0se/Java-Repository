import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MenuSelection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n =0;
		while(true) {
		System.out.println("MENU SELECTION");
	  	System.out.println(" 1 : IF \n" +" 2 : SWITCH \n" +" 3 : WHILE \n" +" 4 : Do-WHILE \n" +" 5 : FOR" + " " );
	  	System.out.println("enter your choice");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  	n=Integer.parseInt(br.readLine());
	  	
	  	
	  	switch(n) {
	  	
	  	case 1:
	  			System.out.println("if ( condition_to_test ) \n{ \n}");
	  			break;
	  	
	  	case 2:
	  			System.out.println("switch (variable) \n {case1:code.... \n default:");
	  			break;
	  	case 3:
	  		
	  			System.out.println("while (expr) { \nstatment(s) \n} ");
      			break;
	  	case 4:
	  			
	  			System.out.println("do { \nstatement(s) \n} \n while(expr); ");
       			break;
	  	case 5:
	  		
	  			System.out.println("for (initialization; termination; increment){ \nstatement(s) \n }" ); 
       			break;
	  	default:
	  			System.out.println("Invalid input..Enter again..");
	  			break;
	  	}
	
	
	}
	
	
	}
}
