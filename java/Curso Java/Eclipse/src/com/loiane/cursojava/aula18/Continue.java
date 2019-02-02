package com.loiane.cursojava.aula18;

import javax.swing.JOptionPane;

public class Continue {

	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer
				.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		num2 = Integer
				.parseInt(JOptionPane.showInputDialog("Digite um limite"));
		for (int i = num1; i <= num2; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}
	}

}
