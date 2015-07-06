import java.util.Arrays;


public class Arrayex1 {

	public static void main(String[] args) {
		int index,num = 5;
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 2, 4, 3, 1, 2 };
		String[] array3 ={"joe","MAX","STEW"};
		
		String arr1 = Arrays.toString(array1);
		String arr2 = Arrays.toString(array2);
		String arr3 = Arrays.toString(array3);
		
		System.out.println("array1: "+ arr1);
		System.out.println("array2: "+ arr2);
		System.out.println("array3: "+ arr3);
		
		System.out.println(arr1.concat(arr2));
		System.out.println(arr1.length());
		System.out.println(arr2.charAt(1));
		System.out.println(arr2.lastIndexOf(2));
		System.out.println(arr3.replace("max", "min"));
		System.out.println(arr3.isEmpty());
		System.out.println(arr3.toLowerCase());
		
		}
	}	

	


