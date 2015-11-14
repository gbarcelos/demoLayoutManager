package br.com.layout.card;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutExample extends JFrame {
	private int currentCard = 1;
	private JPanel cardPanel;
	private CardLayout cl;

	public CardLayoutExample() {

		setTitle("Card Layout Example");
		setSize(300, 150);
		cardPanel = new JPanel();

		cl = new CardLayout();
		cardPanel.setLayout(cl);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JLabel lab1 = new JLabel("Card1");
		JLabel lab2 = new JLabel("Card2");
		JLabel lab3 = new JLabel("Card3");
		JLabel lab4 = new JLabel("Card4");
		p1.add(lab1);
		p2.add(lab2);
		p3.add(lab3);
		p4.add(lab4);

		cardPanel.add(p1, "1");
		cardPanel.add(p2, "2");
		cardPanel.add(p3, "3");
		cardPanel.add(p4, "4");
		JPanel buttonPanel = new JPanel();
		JButton btnPrevious = new JButton("Previous");
		JButton btnNext = new JButton("Next");
		buttonPanel.add(btnPrevious);
		buttonPanel.add(btnNext);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentCard > 1) {
					currentCard -= 1;
					cl.show(cardPanel, "" + (currentCard));
				}
			}
		});

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentCard < 4) {
					currentCard += 1;
					cl.show(cardPanel, "" + (currentCard));
				}
			}
		});
		getContentPane().add(cardPanel, BorderLayout.NORTH);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		CardLayoutExample cl = new CardLayoutExample();
		cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cl.setVisible(true);
	}
}
