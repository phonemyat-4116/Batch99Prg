package method;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,3,6,2};
		int[] B = {6,2,5,8};
		
		int[] C = new int[4];
		
		
		C = add(A,B);
		
		display(C);
		
		

	}
	
	public static int[] add(int a[], int b[]) {
		int[] c = new int[4];
		
		for(int i=0; i<a.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		return c;
	}
	
	public static void display(int C[]) {
		System.out.println("The sum array is "+Arrays.toString(C));
	}

}
