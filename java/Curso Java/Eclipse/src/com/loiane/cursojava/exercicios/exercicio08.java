package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio08 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Descubra quanto você ganha por dia, mês e ano");
		float ganho_Mes, ganho_Dia, ganho_Ano;
		float ganho_Hora = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o quanto você ganha por hora: "));
		float horas_Trabalhadas = Float.parseFloat(JOptionPane.showInputDialog("Digite"
				+ " quantas horas você "
				+ "trabalhou por dia: "));
		ganho_Dia = (float) (ganho_Hora * horas_Trabalhadas);
		ganho_Mes = ganho_Dia * 5;
		ganho_Ano = ganho_Mes * 12;
		JOptionPane.showMessageDialog(null, "O ganho por dia é: " + ganho_Dia
				+ "\n" + "O ganho por mês é: " + ganho_Mes + "\n"
				+ "O ganho por ano é: " + ganho_Ano);

	}

}
