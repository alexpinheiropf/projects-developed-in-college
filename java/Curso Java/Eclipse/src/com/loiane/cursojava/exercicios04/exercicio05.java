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

			System.out.println("A multiplica��o do vetor " + vetA[i]
					+ " na posi��o " + i  + " � " + vetB[i]);
		}

	}

}
