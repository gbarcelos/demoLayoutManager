package br.com.layout.grid;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * http://www.devmedia.com.br/utilizacao-de-gerenciadores-de-layout/8430
 * @author gustavo.barcelos
 *
 */
public class ExemploGridLayout {
	public static void main(String[] args) {

		// Criaremos alguns botões

		JButton bt1 = new JButton("Botão 1");

		JButton bt2 = new JButton("Botão 2");

		JButton bt3 = new JButton("Botão 3");

		JButton bt4 = new JButton("Botão 4");

		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame minhaJanela = new JFrame("Exemplo de GridLayout");

		minhaJanela.setSize(400, 400);

		minhaJanela.setLocation(100, 100);

		minhaJanela.getContentPane().setLayout(new GridLayout(2, 2));

		minhaJanela.getContentPane().add(bt1);

		minhaJanela.getContentPane().add(bt2);

		minhaJanela.getContentPane().add(bt3);

		minhaJanela.getContentPane().add(bt4);

		minhaJanela.setVisible(true);

	}
}
