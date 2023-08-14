package array;

import java.util.Scanner;

public class Multi_dimesional_Array {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows : ");
		int row = scan.nextInt();
		
		System.out.print("Enter number of columns : ");
		int column = scan.nextInt();
		
		int[][] A = new int[row][column];
		
		for(int i = 0; i < A.length; i++) {
			for(int j=0; j < A[i].length; j++) {
				System.out.print("Enter value for row "+i+", column "+j+" : ");
				A[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < A.length; i++) {
			for(int j=0; j < A[i].length; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
