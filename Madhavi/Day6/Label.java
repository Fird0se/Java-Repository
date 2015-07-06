import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Label {

	public static void main(String[] args) throws IOException {
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		//System.out.println("enter integer: " + n);
		
		OuterLoop: for ( int i = 2;; i++) {
		      for (int j = 2; j < i; j++) {
		        if (i % j == 0) {
		          continue OuterLoop;
		        }
		      }
		      System.out.println(n);
		      if (i == n) {
		        break OuterLoop;
		      }
		    }
		}
		

}
