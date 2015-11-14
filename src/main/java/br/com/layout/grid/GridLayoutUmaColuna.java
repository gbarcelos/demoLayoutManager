package br.com.layout.grid;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutUmaColuna {

	public static void main(String[] args) {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame minhaJanela = new JFrame("Exemplo de GridLayout");

		minhaJanela.setSize(400, 400);
		minhaJanela.setLocation(100, 100);
		minhaJanela.getContentPane().setLayout(new GridLayout(0, 1));		

		minhaJanela.getContentPane().add(new JButton("Botão 1"));
		minhaJanela.getContentPane().add(new JButton("Botão 2"));
		minhaJanela.getContentPane().add(new JButton("Botão 3"));
		minhaJanela.getContentPane().add(new JButton("Botão 4"));

		minhaJanela.setVisible(true);
	}
}
