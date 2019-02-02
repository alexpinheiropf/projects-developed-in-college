package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio12 {

	public static void main(String[] args) {
		int num, i, tabuada = 0;
		num = Integer.parseInt(JOptionPane
				.showInputDialog("Digite um numero para fazer a tabuada"));

		for (i = 0; i <= 10; i++) {
			System.out.print("A tabuada de: " + num + " = ");
			System.out.println(i + " x " + num + " é: " + i * num);

		}

	}

}
