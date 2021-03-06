package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGuiB implements ActionListener{
	JButton button;
	
	public static void main(String[] args) {
		SimpleGuiB gui = new SimpleGuiB();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("Click me");
		//This tells the button that I care about listening to the actions performed on him.
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
}
