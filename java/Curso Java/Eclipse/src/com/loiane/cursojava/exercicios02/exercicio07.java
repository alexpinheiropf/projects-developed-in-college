package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio07 {

	public static void main(String[] args) {
		int num1, num2, num3;

		num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o 1� numero"));
		num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o 2� numero"));
		num3 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o 3� numero"));

		if (num1 > num2 && num1 > num3) {
			JOptionPane
					.showMessageDialog(null, "O numero " + num1 + " � maior");
		} else if (num2 > num1 && num2 > num3) {
			JOptionPane
					.showMessageDialog(null, "O numero " + num2 + " � maior");
		} else {
			JOptionPane
					.showMessageDialog(null, "O numero " + num3 + " � maior");
		}
		if (num1 < num2 && num1 < num3) {
			JOptionPane
					.showMessageDialog(null, "O numero " + num1 + " � menor");
		} else if (num2 < num1 && num2 < num3) {
			JOptionPane
					.showMessageDialog(null, "O numero " + num2 + " � menor");
		} else if (num3 < num1 && num3 < num2) {
			JOptionPane
					.showMessageDialog(null, "O numero " + num3 + " � menor");

		}
	}

}
