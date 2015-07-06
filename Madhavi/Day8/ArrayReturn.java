import java.util.Scanner;


public class ArrayReturn {

	public static void main(String[] args) {
		
		
		getIndexOf();
	}
		public static int getIndexOf( )
		{
			int[] index;
			int Search = 60;
			int marks[] = {20,30,40,50,60,34};
			for (int i=0 ; i<5 ; i++)
			System.out.println(marks[i]);
			
		    for( int j=0; j<=5 ; j ++ )
		    if( marks[ j ] == Search)
		    return j;

		  return -1;
		}
	
}	
	
	
		



