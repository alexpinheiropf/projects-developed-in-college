package com.loiane.cursojava.exercicios04;

import javax.swing.JOptionPane;

public class exercicios06 {

	public static void main(String[] args) {
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int[] vetC = new int[5];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o valor do Vetor A: " + i));
		}
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o valor do Vetor B: " + i));

			vetC[i] = vetA[i] + vetB[i];

			System.out.println("A soma do Vetor A: " + vetA[i]
					+ " com o Vetor B: " + vetB[i] + " \n é : " + vetC[i]);

		}

	}

}
