package method;

import java.util.Scanner;

public class StarMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a character : ");
		char ch = scan.next().charAt(0);
		
		System.out.print("Enter number of rows : ");
		int row = scan.nextInt();
		
		System.out.print("Enter number of column : ");
		int col = scan.nextInt();
		
		display(ch,row,col);

	}
	
	public static void display(char Ch, int Row, int Col) {
		for(int i=1; i<=Row; i++) {
			for(int k=1; k<=Col; k++) {
				System.out.print(Ch+" ");
			}
			
			System.out.println();
		}
	}

}
