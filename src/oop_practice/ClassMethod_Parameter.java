package oop_practice;

import java.util.Scanner;

class Box_1{
	
	double squareArea(double h, double l) {
		return h*l;
	}
}

public class ClassMethod_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Box_1 square = new Box_1();
		
		double height = scan.nextDouble();
		
		double length = scan.nextDouble();
		
		System.out.println("The area of square is "+square.squareArea(height, length));

	}

}
