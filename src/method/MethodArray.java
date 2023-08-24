package method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodArray {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[5];
		
		input(A,A.length);
		
		display(A);
		
		System.out.println();
		
		System.out.println(A[max(A,A.length)]+" is at index "+max(A,A.length));

	}
	
	public static void input(int[] a, int n) {
		for(int i=0; i<a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = scan.nextInt();
		}
	}
	
	public static void display(int[] a) {
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public static int max(int[] a, int n) {
//		Arrays.sort(a);
//		
//		return a[a.length-1];
		
		int max = a[0];
		int index = 0;
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]>max) {
				max = a[i];
				index = i;
			}
		}
		
		return index;
	}

}
