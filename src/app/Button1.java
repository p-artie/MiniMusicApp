package app;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 {
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click this");
		Font bigfont = new Font("serif", Font.BOLD, 28);
		button.setFont(bigfont);
		frame.getContentPane().add(BorderLayout.NORTH, button);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
