package br.com.layout.flow;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutTeste {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloSwing");
		JPanel panel = new JPanel();
		JButton button1 = new JButton("button1");
		JLabel label1 = new JLabel("label1");
		JButton button2 = new JButton("button2");
		JLabel label2 = new JLabel("label2");
		panel.setLayout(new FlowLayout());
		panel.add(button1);
		panel.add(button2);
		panel.add(label1);
		panel.add(label2);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
