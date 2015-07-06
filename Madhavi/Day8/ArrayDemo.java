
public class ArrayDemo {

	public static void main(String[] args) {
		
		int marks[] = {20,30,40,50,60,34};
		for (int i=0;i<=5;i++)
		System.out.println(marks[i]);
			
		int c,u = 30;
		for (c=0;c<= 5;c++)
		{
		
			if( marks[c] ==u ){
			System.out.println(u + " is at location " + c);
			break;
			}

		}
		
		if (c == 6){//c=6 c>5
			System.out.println(u + " does't exist");
		}
	}
}