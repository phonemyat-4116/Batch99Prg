package method;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter length of rectangle : ");
		int length = scan.nextInt();
		
		System.out.print("Enter height of rectangle : ");
		int height = scan.nextInt();
		
		
		System.out.println("The area of rectangle is "+rectangleArea(length,height));
		
		System.out.println("The area of rectangle is "+rectangleParameter(length,height));

	}
	
	public static int rectangleArea(int l, int h) {
		return (l*h);
	}
	
	public static int rectangleParameter(int l, int h) {
		return (2*(l+h));
	}

}
