package com.loiane.cursojava.exerciciosComplementar;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		String nome1, nome2, nome3;
		String pessoaVelha = null, pessoaNova = null;
		int idade1, idade2, idade3;

		nome1 = JOptionPane.showInputDialog("Digite o nome da 1ª pessoa");

		idade1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a idade da 1ª pessoa"));

		nome2 = JOptionPane.showInputDialog("Digite o nome da 2ª pessoa");

		idade2 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a idade da 2ª pessoa"));

		nome3 = JOptionPane.showInputDialog("Digite o nome da 3ª pessoa");

		idade3 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a idade da 3ª pessoa"));

		if (idade1 > idade2 && idade1 > idade3) {
			pessoaVelha = nome1;
		} else if (idade2 > idade1 && idade2 > idade3) {
			pessoaVelha = nome2;
		} else if (idade3 > idade1 && idade3 > idade2) {
			pessoaVelha = nome3;
		}

		if (idade2 < idade1 && idade2 < idade3) {
			pessoaNova = nome2;
		} else if (idade1 < idade2 & idade1 < idade3) {
			pessoaNova = nome1;
		} else if (idade3 < idade1 && idade3 < idade2) {
			pessoaNova = nome3;
		}
		JOptionPane.showMessageDialog(null, "A pessoa mais velha é "
				+ pessoaVelha + "\n e a pessoa mais nova é " + pessoaNova);

	}
}
