package method;

import java.util.Scanner;

public class Recursive_Method {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		recursive --> direct recursive, indirect recursive 
		
		
		System.out.println("Enter First Number");
		int fnum = scan.nextInt();
		
		System.out.println("Enter Second Number");
		int snum = scan.nextInt();
		
		sum(fnum,snum);
		
		
		

	}
	
	public static void sum(int num1, int num2) {
		
		int result = num1+num2;
		
		if(result <= 100) {
			System.out.println("Enter First Number");
			int fnum = scan.nextInt();
			
			System.out.println("Enter Second Number");
			int snum = scan.nextInt();
			
			sum(fnum, snum);
		}else {
			System.out.println("The sum is "+result);
		}
		
		
	}

}
