package sample_program;

import java.util.Arrays;
import java.util.Scanner;

public class ProveRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		double sides[] = new double[3];
		
		for(int i=0; i<sides.length; i++) {
			System.out.print("Enter side : ");
			sides[i] = scan.nextDouble();
		}
		
		Arrays.sort(sides);
		
		System.out.println(Arrays.toString(sides));
		
		double firstSquare = sides[0]*sides[0];
		
		double secondSquare = sides[1]*sides[1];
		
		double thirdSquare = sides[2]*sides[2];
		
		if(firstSquare+secondSquare == thirdSquare) {
			System.out.println("The triangle is right triangle");
		}else {
			System.out.println("The triangle is not right triangle");
		}
		
		

	}

}
