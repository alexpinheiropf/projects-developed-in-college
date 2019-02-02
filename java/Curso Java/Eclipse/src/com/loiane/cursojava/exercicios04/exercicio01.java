package com.loiane.cursojava.exercicios04;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int i = 0;

		for (i = 0; i < vetA.length; i++) {
			vetA[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um valor na posição do vetor: " + i));
			
			vetB[i] = vetA[i];
			
			System.out.println("O valores do Vetor A é: " + vetB[i]);
		}

		

	}

}
