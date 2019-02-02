package com.loiane.cursojava.exercicios04;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {
		int[] vetA = new int[10];
		int[] vetB = new int[10];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um valor no vetor:" + i));

			vetB[i] = vetA[i] * i;

			System.out.println("A multiplicação do vetor " + vetA[i]
					+ " na posição " + i  + " é " + vetB[i]);
		}

	}

}
