package br.com.layout.border;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayoutTeste {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloSwing");
		JPanel panel = new JPanel();
		JButton button1 = new JButton("button1");
		JLabel label1 = new JLabel("label1");
		JButton button2 = new JButton("button2");
		JLabel label2 = new JLabel("label2");
		panel.setLayout(new BorderLayout());
		panel.add(button1, BorderLayout.NORTH);
		panel.add(button2, BorderLayout.SOUTH);
		panel.add(label1, BorderLayout.WEST);
		panel.add(label2, BorderLayout.EAST);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
