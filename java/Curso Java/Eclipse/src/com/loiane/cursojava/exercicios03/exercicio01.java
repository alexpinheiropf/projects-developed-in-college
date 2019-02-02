package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		int idade;

		do {
			idade = Integer.parseInt(JOptionPane
					.showInputDialog("Digite uma nota: "));

			if (idade > 0 && idade <= 90) {
				JOptionPane.showMessageDialog(null, "Valor da idade é: " + idade);

			} else {
				JOptionPane.showMessageDialog(null,
						"Valor Inválido!!! \n Insira novamente");
			}

		} while (!(idade > 0) || (!(idade <=90)));

	}

}
