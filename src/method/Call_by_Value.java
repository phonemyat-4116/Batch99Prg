package method;

import java.util.Scanner;

public class Call_by_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		System.out.println();
		
		swap(num1,num2);
		
		

	}
	
	public static void swap(int a, int b) {
		int temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("After swapping ");
		
		System.out.println("num1 = "+a);
		System.out.println("num2 = "+b);
	}

}
