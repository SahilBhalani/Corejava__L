package Arrays_Questions;

import java.util.Arrays;

public class Array_Add {

	public static void main(String[] args) {

		int[] arr = { 3, 6, 1 };
		int[] brr = { 16, 10, 8, 11, 5};

		int a1 = arr.length;
		int b1 = brr.length;

		int c1 = a1 + b1;
		int[] c = new int[c1];
		
		 for (int i = 0; i < a1; i++) {
	 
	            c[i] = arr[i];
	        }

		  
	        for (int i = 0; i < b1; i++) {

	            c[a1 + i] = brr[i];
	        }
		 
	        Arrays.sort(c);
	        
	        for(int n : c)
	        {
	        	System.out.print(n+" ");
	        }
	        
	//System.out.println("result is = " + Arrays.toString(c));
	}
}
