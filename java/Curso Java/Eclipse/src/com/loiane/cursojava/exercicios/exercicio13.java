package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio13 {

	public static void main(String[] args) {
		float salario;
		float ganhoHora = Float.parseFloat(JOptionPane
				.showInputDialog("Quanto voc� ganha por hora:"));
		float numHora = Float.parseFloat(JOptionPane
				.showInputDialog("Quantas horas voc� trabalha por m�s:"));

		salario = (ganhoHora * numHora);
		float IR = (salario * 11)/100;
		float inss = (salario * 8)/100;
		float sindicato = (salario * 5)/100;
		float salarioLiquido = (salario - (inss + sindicato + IR));

		JOptionPane.showMessageDialog(null, "O seu Salario bruto �: R$ " + salario
				+ "\n" + "Voc� pago ao INSS: R$ " + inss + "\n"
				+ "Foi descontado de IR: "+ IR + "\n"
				+ "Voc� pagou ao Sindicato: R$ " + sindicato + "\n"
				+ "O seu Salario l�quido � de: R$ " + salarioLiquido);

	}

}
