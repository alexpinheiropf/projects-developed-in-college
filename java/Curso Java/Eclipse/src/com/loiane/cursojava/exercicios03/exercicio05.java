package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {
		float a, b, taxaA, taxaB;
		int i = 0;

		a = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o nº de população para pais A"));
		b = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o nº de população para pais B"));

		taxaA = Float
				.parseFloat(JOptionPane
						.showInputDialog("Digite a taxa de crescimento de população para pais A"));
		taxaB = Float
				.parseFloat(JOptionPane
						.showInputDialog("Digite a taxa de crescimento de população para pais B"));
		do {
			a += (a * taxaA) / 100;
			b += (b * taxaB) / 100;
			i++;
		} while (a < b);

		System.out.println("A população de A é: " + a + "\n"
				+ "A poulação de B é: " + b + "\n" + "Os anos são: " + i);

	}

}