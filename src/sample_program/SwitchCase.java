package sample_program;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int result;
		
		
		char ch;
		
		
		do {
			
			System.out.print("Enter first num : ");
			int fnum = scan.nextInt();
			
			System.out.print("Enter second num : ");
			int snum = scan.nextInt();
			
			System.out.println("Enter Operator");
			ch = scan.next().charAt(0);
			
			switch(ch) {
			case '+':
				result = fnum + snum;
				System.out.println("The result is "+result);
				break;
				
			case '-':
				if(fnum>snum) {
					result = fnum - snum;
					System.out.println("The result is "+result);
				}else {
					System.out.println("The first number must be greater");
				}
				break;
				
			case '*':
				result = fnum * snum;
				System.out.println("The result is "+result);
				break;
				
			case '/':
				result = fnum / snum;
				System.out.println("The result is "+result);
				break;
				
			default:
				System.out.println("The Wrong Opeartor. Try Again!");
				
			}
			
			
		}while(!(ch=='+' || ch=='-' || ch=='*' || ch=='/'));

	}

}
