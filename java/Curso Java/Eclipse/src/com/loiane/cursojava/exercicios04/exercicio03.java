package com.loiane.cursojava.exercicios04;

import javax.swing.JOptionPane;

public class exercicio03 {

	public static void main(String[] args) {
		int[] vetA = new int[15];
		int[] vetB = new int[15];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um valor no vetor: " + i));

			vetB[i] = vetA[i] * vetA[i];

			System.out.println("O valor do Vetor A é: " + vetA[i]
					+ " e elevado ao quadrado3: " + vetB[i]);

		}

	}

}
