package gui_practice;

import javax.swing.*;

public class SwingDemo {
	
	SwingDemo(){
		
		JFrame jfr = new JFrame("A Simple Swing Application");
		
		jfr.setSize(350,100);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lab = new JLabel("Swing is powerful Toolkit");
		
		jfr.add(lab);
		
		jfr.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingDemo sw = new SwingDemo();
		
		

	}

}
