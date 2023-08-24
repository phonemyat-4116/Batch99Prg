package algorithm;

import java.util.Scanner;

public class ItemSearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		ElectronicSystem ele = new ElectronicSystem();
		
		char ch;
		
		do {
			
			ele.WelcomePage();
			
			System.out.print("Wanna take service again. (Y/N) : ");
			ch = scan.next().charAt(0);
			
			System.out.println();
			
		}while(Character.toUpperCase(ch)=='Y');
		
		

	}
	

}
