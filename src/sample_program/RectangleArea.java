package sample_program;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Length : ");
		double Length = scan.nextDouble();
		
		System.out.print("Enter Height : ");
		double Height = scan.nextDouble();
		
		double result = Length * Height;
		
		System.out.println("The area of rectangle : "+result);

	}

}
