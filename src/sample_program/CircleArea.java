package sample_program;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		final double PI = 3.14; // constant value
		
		System.out.print("Enter radius : ");
		double radius = scan.nextDouble();
		
		double result = (PI*radius*radius);
		
		System.out.println("The circle area of radius "+radius+" is "+result);

	}

}
