package br.com.layout.flow;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * http://www.devmedia.com.br/utilizacao-de-gerenciadores-de-layout/8430
 * @author gustavo.barcelos
 *
 */
public class ExemploFlowLayout {
	public static void main(String[] args) {

		// Declaramos o visual do nosso frame

		JFrame.setDefaultLookAndFeelDecorated(true);

		// Criamos nosso Frame

		JFrame minhaJanela = new JFrame("Exemplo de Flow Layout");

		// Criaremos alguns bot�es

		JButton bt1 = new JButton("Menu 1");

		JButton bt2 = new JButton("Menu 2");

		JButton bt3 = new JButton("Menu 3");

		JButton bt4 = new JButton("Menu 4");

		JButton bt5 = new JButton("Menu 5");

		JButton bt6 = new JButton("Menu 6");

		// Configuramos nosso JFrame

		minhaJanela.setSize(600, 400);

		minhaJanela.setLocation(200, 200);

		// Declaramos ser� utilizado o gerenciador FlowLayout

		minhaJanela.getContentPane().setLayout(new FlowLayout());

		// Adicionamos os componentes em nossa janela

		minhaJanela.getContentPane().add(bt1);

		minhaJanela.getContentPane().add(bt2);

		minhaJanela.getContentPane().add(bt3);

		minhaJanela.getContentPane().add(bt4);

		minhaJanela.getContentPane().add(bt5);

		minhaJanela.getContentPane().add(bt6);

		minhaJanela.setVisible(true);

	}

}
