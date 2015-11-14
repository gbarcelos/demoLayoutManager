package br.com.layout.grid;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutTeste {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloSwing");
		JPanel panel = new JPanel();
		JButton button1 = new JButton("button1");
		JLabel label1 = new JLabel("label1");
		JButton button2 = new JButton("button2");
		JLabel label2 = new JLabel("label2");
		JButton button3 = new JButton("button3");
		JButton button4 = new JButton("button4");
		JButton button5 = new JButton("button5");
		
		panel.setLayout(new GridLayout());
		panel.add(button1);
		panel.add(button2);
		panel.add(label1);
		panel.add(label2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
