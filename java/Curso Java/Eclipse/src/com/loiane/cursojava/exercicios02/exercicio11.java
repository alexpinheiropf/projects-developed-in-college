package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio11 {

	public static void main(String[] args) {
		float salario, salarioAjustado, aumento, percentual = 0;

		salario = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o seu salario: "));

		if (salario <= 280) {
			percentual = 20f;

		} else if (salario > 280 && salario <= 700) {
			percentual = 15f;

		} else if (salario > 700 && salario < 1500) {
			percentual = 10f;

		} else if (salario >= 1500) {
			percentual = 5f;
		}
		aumento = (salario * percentual) / 100;
		salarioAjustado = (salario + aumento);

		JOptionPane.showMessageDialog(null, "O salario antes reajuste era: R$ "
				+ salario + "\n" + "O percentual é : " + percentual + " %"
				+ "\n" + "O valor do aumento é: R$ " + aumento + "\n"
				+ "O novo salario fico de R$ " + salarioAjustado);
	}
}
