package sample_program;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String definedUserName = "Kelvin";
		String definePassword = "admin123";
		
		String userName;
		String password;
		
		do {
			
			System.out.println("Enter username");
			userName = scan.nextLine();
			
			System.out.println("Enter password");
			password = scan.nextLine();
			
			if(userName.equals(definedUserName) && password.equals(definePassword)) {
				System.out.println("Successfully Login");
			}else {
				System.out.println("Try Again");
			}
			
			System.out.println();
			
		}while(!(userName.equals(definedUserName) && password.equals(definePassword)));
		
		
		

	}

}
