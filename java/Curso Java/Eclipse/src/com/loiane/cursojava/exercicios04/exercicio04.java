package com.loiane.cursojava.exercicios04;

import javax.swing.JOptionPane;

public class exercicio04 {

	public static void main(String[] args) {
		int[] vetA = new int[5];
		int[] vetB = new int[5];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um valor no vetor:" + i));

			vetB[i] = (int) Math.sqrt(vetA[i]);

			System.out.println("A raiz quadrada do vetor " + vetA[i] + " é "
					+ vetB[i]);
		}

	}

}
