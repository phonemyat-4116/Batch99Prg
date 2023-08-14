package method;

import java.util.Scanner;

public class MethodExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int fnum = scan.nextInt();
		
		System.out.print("Enter second number : ");
		int snum = scan.nextInt();
		
		max(fnum,snum); //actual parameter
		
		System.out.println("The mininum value is "+min(fnum,snum));

	}
	
	public static void max(int num1, int num2) { // formal parameter
		
		int max=0;
		
		if(num1>num2) {
			max = num1;
		}else {
			max = num2;
		}
		
		System.out.println("The maximum value is "+max);
			
	}
	
	public static int min(int num1, int num2) { // formal parameter
		
		int min=0;
		
		if(num1<num2) {
			min = num1;
		}else {
			min = num2;
		}
		
		return min;
			
	}

}
