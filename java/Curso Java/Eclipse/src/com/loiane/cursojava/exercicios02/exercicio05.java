package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {

		String aluno;
		int media, nota1, nota2;

		aluno = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
		nota1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a nota 1:"));
		nota2 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a nota 2:"));

		media = (nota1 + nota2) / 2;

		if (media >= 7 && media < 10) {
			JOptionPane.showMessageDialog(null, "O Aluno " + aluno
					+ " com média: " + media + " está Aprovado.");
		} else if (media < 7) {
			JOptionPane.showMessageDialog(null, "O Aluno " + aluno
					+ " com média: " + media + " está Reprovado.");
		} else if (media == 10) {
			JOptionPane.showMessageDialog(null, "O Aluno " + aluno
					+ " com média: " + media
					+ " está Aprovado com Distinção!!!");
		}

	}
}
