package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio11 {

	public static void main(String[] args) {
		int num1, num2;
		float num3;
		int a, b, c;

		num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor do numero 1:"));
		num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor do numero 2:"));
		num3 = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o valor do numero 3:"));
		a = (int) ((num1 * num1) + (num2 / 2));
		b = (int) ((int) (num1 * 3) + num3);
		c = (int) Math.pow(num3, 3);
		JOptionPane.showMessageDialog(null, 
				"O produto do dobro do primeiro com a metade do segundo: " + a + "\n"+
				"A soma do triplo do primeiro com o teceiro: "+ b + "\n"  +
				"O terceiro elevado ao cubo: " + c);

	}

}
