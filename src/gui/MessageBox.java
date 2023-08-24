package gui;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Username : ");
		String userName = scan.nextLine();
		
		System.out.print("Enter Password : ");
		String password = scan.nextLine();
		
		if(userName.equals("admin") && password.equals("123")) {
			JOptionPane.showMessageDialog(null, "Login Successfully");
			
		}else {
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.QUESTION_MESSAGE);
		}
		
		
		JOptionPane.showConfirmDialog(null, "Do another. [Y/N]");
		
		if(JOptionPane.YES_OPTION == 0) {
			JOptionPane.showConfirmDialog(null, "Do you remove item", "Delete Title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
	
		}

	}

}
