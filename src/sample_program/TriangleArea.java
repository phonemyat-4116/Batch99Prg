package sample_program;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Base of Triangle : ");
		double base = scan.nextDouble();
		
		System.out.print("Enter Height of Triangle : ");
		double height = scan.nextDouble();
		
		double result = 0.5*base*height;
		
		System.out.print("The area of Triangle is "+result);
		
		
		

	}

}
