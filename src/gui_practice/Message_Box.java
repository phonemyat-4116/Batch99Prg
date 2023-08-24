package gui_practice;

import javax.swing.JOptionPane;

public class Message_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JOptionPane.showMessageDialog(null, "This is plane message", "Message Box", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is error message", "Error Box", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is info message", "Info Box", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is warning message", "Warning Box", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is question message", "Question Box", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello World");
		
//		int answer = JOptionPane.showConfirmDialog(null, "Is real?", "Confirm Box", JOptionPane.YES_NO_CANCEL_OPTION);
		
		
//		int answer = JOptionPane.showConfirmDialog(null, "Is True", "Confirm Box", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		
//		String answer = JOptionPane.showInputDialog("What is your name?");
		
		String fruit[]= {"Orange","Peach"};
		
		int answer = JOptionPane.showOptionDialog(
				null,
				"What is your choice? ",
				"Item Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				fruit,
				0);
		
		System.out.println(answer);
		
		
		

	}

}
