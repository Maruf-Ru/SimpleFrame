package jframe.java;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;




public class MyClass {
	
	public static void main(String[]args)
	{
		
		JFrame Frame= new JFrame("Simple Frame");
		
		JButton button=new JButton("North");
		JButton button1=new JButton("east");
		JButton button2=new JButton("west");
		JButton button3=new JButton("south");
		JButton button4=new JButton("center");
		
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(button, BorderLayout.NORTH);
		panel.add(button1, BorderLayout.EAST);
		panel.add(button2, BorderLayout.WEST);
		panel.add(button3, BorderLayout.SOUTH);
		panel.add(button4, BorderLayout.CENTER);
	
		Frame.setSize(1000,500);
	    Frame.add(panel);
		

		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
