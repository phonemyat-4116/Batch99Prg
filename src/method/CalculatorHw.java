package method;

import java.util.Scanner;

public class CalculatorHw {

	static int num1, num2;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		CalculatorHw.num1 = scan.nextInt();
		
		System.out.print("Enter second number : ");
		CalculatorHw.num2 = scan.nextInt();
		
		display('/');

	}
	
	public static int fadd(int a, int b) {
		return a+b;
	}
	
	public static int fsub(int a, int b) {
		return a-b;
	}
	
	public static int fmul(int a, int b) {
		return a*b;
	}
	
	public static int fdiv(int a, int b) {
		return a/b;
	}
	
	public static void display(char op) {
		switch(op) {
		case '+':
			System.out.println("The add value is "+fadd(CalculatorHw.num1,CalculatorHw.num2));
			break;
			
		case '-':
			System.out.println("The sub value is "+fsub(CalculatorHw.num1,CalculatorHw.num2));
			break;
			
		case '*':
			System.out.println("The multiply value is "+fmul(CalculatorHw.num1,CalculatorHw.num2));
			break;
			
		case '/':
			System.out.println("The division value is "+fdiv(CalculatorHw.num1,CalculatorHw.num2));
			break;
			
			default:
				System.out.println("Wrong operator");
		}
		
	}

}
