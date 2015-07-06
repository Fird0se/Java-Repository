import java.io.*; 

public class Factorial{

	public static void main(String args[]) throws IOException {

	int num,f=1;
	
	System.out.println("Enter a number");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	num=Integer.parseInt(br.readLine());
	if(num==0){
		
		System.out.println("Factorial of 0 is: 1");
	}
	else{
	for(int i=num;i>0;i--)
	{
		f=f*i;
	}
		System.out.println("Factorial of "+num+" is: "+f);
	}
}
}