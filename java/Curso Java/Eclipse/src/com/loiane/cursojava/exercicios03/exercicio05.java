package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {
		float a, b, taxaA, taxaB;
		int i = 0;

		a = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o n� de popula��o para pais A"));
		b = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o n� de popula��o para pais B"));

		taxaA = Float
				.parseFloat(JOptionPane
						.showInputDialog("Digite a taxa de crescimento de popula��o para pais A"));
		taxaB = Float
				.parseFloat(JOptionPane
						.showInputDialog("Digite a taxa de crescimento de popula��o para pais B"));
		do {
			a += (a * taxaA) / 100;
			b += (b * taxaB) / 100;
			i++;
		} while (a < b);

		System.out.println("A popula��o de A �: " + a + "\n"
				+ "A poula��o de B �: " + b + "\n" + "Os anos s�o: " + i);

	}

}