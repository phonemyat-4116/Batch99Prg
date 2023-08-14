package method;

import java.util.Scanner;


public class ConvertFeet {
	
	static float f1;
	static float f2;
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		f1 = InputHeight();
		f2 = InputHeight();
		
		System.out.println("The result is "+display(f1,f2));
		
		

	}
	
	public static float convertFeet(float i) {
		return i/12;
		
	}
	
	public static float InputHeight() {
		System.out.print("Enter Feet : ");
		float feet = scan.nextFloat();
		
		System.out.print("Enter Inches : ");
		float inches = scan.nextFloat();
		
		System.out.println();
		
		float converted_feet = convertFeet(inches);
		
		return converted_feet + feet;
		
	}
	
	public static float display(float feet1, float feet2) {
		return feet1 + feet2;
	}

}
