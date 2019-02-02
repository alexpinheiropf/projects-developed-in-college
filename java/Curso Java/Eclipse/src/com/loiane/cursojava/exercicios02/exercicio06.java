package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio06 {

	public static void main(String[] args) {
		int num1, num2, num3;

		num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o 1º numero: "));
		num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o 2º numero: "));
		num3 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o 3º numero: "));

		if (num1 > num2 && num1 > num3) {
			JOptionPane.showMessageDialog(null, "O 1º numero é maior");
		} else if (num2 > num1 && num2 > num3) {
			JOptionPane.showMessageDialog(null, "O 2º numero é maior");

		} else {
			JOptionPane.showMessageDialog(null, "O 3º numero é maior");
		}

	}

}
