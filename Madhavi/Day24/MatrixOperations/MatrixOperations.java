package package24;

import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		
		int c,d =0 ;
		int[][] sum,subtract,multi,divison;
		int a[][] = new int[3][3];
	    int b[][] = new int[3][3];
		
		Scanner input = new Scanner(System.in);
	       
	    System.out.println("Enter first matrix");
	    for ( c = 0 ; c < 3 ; c++ )
	    {
	         for ( d = 0 ; d < 3 ; d++ ){
	        	 a[c][d] = input.nextInt();
	        	 System.out.print(a[c][d]+" ");
	         }
	         System.out.println();
	         
	    }	
	          
	    System.out.println("Enter second matrix");
	    for (  c = 0 ; c < 3 ; c++ ){
	         for ( d = 0 ; d < 3 ; d++ ){
	            b[c][d] = input.nextInt();
	            System.out.print(b[c][d] + " ");
	         }
	         System.out.println();
	    }
	       
	     sum = add(a, b);
	     subtract = subtract(a,b);
	     multi = multi(a,b);
	     divison = divison(a,b);
	       
	       System.out.println("Matrix Addition");
	       displayMatrix(sum);
	       	       
	       System.out.println("Matrix Subtraction");
	       displayMatrix(subtract);
	       
	       System.out.println("Matrix Multiplication");
	       displayMatrix(multi);
	       
	       System.out.println("Matrix Divison");
	       displayMatrix(divison);
	       
	   }

	   public static int[][] add(int[][] a, int[][] b) {
	       int rows = a.length;
	       int columns = a.length;
	       int[][] result = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = a[i][j] + b[i][j];
	           }
	       }
	       return result;
	   }

	   public static int[][] subtract(int[][] a, int[][] b) {
	       int rows = 3;
	       int columns = 3;
	       int[][] result = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = a[i][j] - b[i][j];
	           }
	       }
	       return result;
	   }
	   
	   public static int[][] multi(int[][] a, int[][] b) {
	       int rows = a.length;
	       int columns = a.length;
	       int[][] result = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = a[i][j] * b[i][j];
	           }
	       }
	       return result;
	   }
	   
	   public static int[][] divison(int[][] a, int[][] b) {
	       int rows = a.length;
	       int columns = a.length;
	       int[][] result = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = a[i][j] / b[i][j];
	           }
	       }
	       return result;
	   }

	   public static void displayMatrix(int[][] matrix) {
	       int rows = matrix.length;
	       int columns = matrix.length;
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(matrix[i][j] + " ");
	           }
	           System.out.println();
	       }
	   }
	}


	


