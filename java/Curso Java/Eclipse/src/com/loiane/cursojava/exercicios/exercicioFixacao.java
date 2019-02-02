package com.loiane.cursojava.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class exercicioFixacao {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Descubra quanto voc� ganha em horas, dias, m�s e ano");

		NumberFormat formatarFloat = new DecimalFormat("#.##");
		float dia, ganho_Ano, ganho_Dia, hora, ganho_Hora;
		float salario = Float.parseFloat(JOptionPane
				.showInputDialog("Digite quanto � seu salario bruto mensal: "));
		float salariof = Float.parseFloat(formatarFloat.format(salario).replace(",", "."));
		dia = Float.parseFloat(JOptionPane
				.showInputDialog("Quantos dias voc� trabalhou no m�s?"));
		float diaf = Float.parseFloat(formatarFloat.format(dia).replace(",", "."));
		hora = Float.parseFloat(JOptionPane
				.showInputDialog("Quantas horas voc� trabalhou no dia?"));
		float horaf = Float.parseFloat(formatarFloat.format(hora).replace(",", "."));
		ganho_Dia = (salario / dia);
		float ganho_Diaf = Float.parseFloat(formatarFloat.format(ganho_Dia).replace(",", "."));
		ganho_Hora = (ganho_Dia / hora);
		float ganho_Horaf = Float.parseFloat(formatarFloat.format(ganho_Hora).replace(",", "."));
		ganho_Ano = (salario * 12);
		float ganho_Anof = Float.parseFloat(formatarFloat.format(ganho_Ano).replace(",", "."));

		JOptionPane
				.showMessageDialog(null, "Voc� ganhou: " + "\n" + "em horas: R$ "
						+ ganho_Horaf + "\n" + "em dias: R$ " + ganho_Diaf + "\n"
						+ " em m�s: R$ " + salariof + "\n " + "em ano: R$ "
						+ ganho_Anof);

	}

}