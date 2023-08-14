package method;

import java.util.Scanner;

public class Mutiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		mutiplication(num);

	}
	
	public static void mutiplication(int n) {
		for(int i=1; i<=12; i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}

}
