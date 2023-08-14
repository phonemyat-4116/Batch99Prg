package method;

import java.util.Scanner;

public class MethodExample2 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		do {
			System.out.print("Enter first number : ");
			int fnum = scan.nextInt();
			
			System.out.print("Enter second number : ");
			int snum = scan.nextInt();
			
			System.out.print("Enter operator : ");
			char operator = scan.next().charAt(0);
			
			int result = 0;
			
			switch(operator) {
			case '+':
				result = sum(fnum,snum);
				System.out.println("The sum value is "+result);
				break;
				
			case '-':
				result = subtract(fnum,snum);
				System.out.println("The sum value is "+result);
				break;
				
			case '*':
				result = mutiply(fnum,snum);
				System.out.println("The sum value is "+result);
				break;
				
			case '/':
				result = division(fnum,snum);
				System.out.println("The sum value is "+result);
				break;
				
				default:
					System.out.println("Wrong operator");
			}
			
			
		}while(repeat());
		

	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public static int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public static int mutiply(int num1, int num2) {
		return num1*num2;
	}
	
	public static int division(int num1, int num2) {
		return num1/num2;
	}
	
	public static boolean repeat() {
		System.out.println("Do you wanna try again. Y/N");
		char confirm = scan.next().charAt(0);
		
		if(Character.toUpperCase(confirm)=='Y') {
			return true;
		}else {
			System.out.println("The process end!");
			return false;
		}
	}
	


}
