package com.loiane.cursojava.exercicios04;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		int[] vetA = new int[8];
		int[] vetB = new int[8];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um valor no vetor: " + i));

			vetB[i] = vetA[i] * 2;

			System.out.println("O valor do Vetor A é: " + vetA[i]
					+ " e multiplicado por 2 é: " + vetB[i]);

		}

	}

}
