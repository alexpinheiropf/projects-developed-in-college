package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio08 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Descubra quanto voc� ganha por dia, m�s e ano");
		float ganho_Mes, ganho_Dia, ganho_Ano;
		float ganho_Hora = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o quanto voc� ganha por hora: "));
		float horas_Trabalhadas = Float.parseFloat(JOptionPane.showInputDialog("Digite"
				+ " quantas horas voc� "
				+ "trabalhou por dia: "));
		ganho_Dia = (float) (ganho_Hora * horas_Trabalhadas);
		ganho_Mes = ganho_Dia * 5;
		ganho_Ano = ganho_Mes * 12;
		JOptionPane.showMessageDialog(null, "O ganho por dia �: " + ganho_Dia
				+ "\n" + "O ganho por m�s �: " + ganho_Mes + "\n"
				+ "O ganho por ano �: " + ganho_Ano);

	}

}
