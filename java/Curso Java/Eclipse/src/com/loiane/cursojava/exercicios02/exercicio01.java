package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		float num1, num2;

		num1 = Float.parseFloat(JOptionPane
				.showInputDialog("Digite um numero:"));
		num2 = Float.parseFloat(JOptionPane
				.showInputDialog("Digite outro numero:"));

		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O numero: " + num1
					+ " É maior que: " + num2);

		}else if(num1 == num2){
			JOptionPane.showMessageDialog(null, "Os numero são iguais");
		}
		else {
			JOptionPane.showMessageDialog(null, "O numero: " + num2
					+ " É maior que: " + num1);
		}
	}

}
