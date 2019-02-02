package com.loiane.cursojava.exercicios04;

import javax.swing.JOptionPane;

public class exercicio09 {

	public static void main(String[] args) {
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int[] vetC = new int[5];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "
					+ (i + 1) + "º valor do vetor A na posição " + i));
		}
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "
					+ (i + 1) + "º valor do vetor do vetor B na posição " + i));

			vetC[i] = vetA[i] / vetB[i];

		}

		for (int i = 0; i < vetC.length; i++) {
			System.out.println("Vetor A: " + vetA[i] + " / Vetor B: " + vetB[i]
					+ " \n é : " + vetC[i]);
		}

	}

}
