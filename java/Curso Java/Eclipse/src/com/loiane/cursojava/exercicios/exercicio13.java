package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio13 {

	public static void main(String[] args) {
		float salario;
		float ganhoHora = Float.parseFloat(JOptionPane
				.showInputDialog("Quanto você ganha por hora:"));
		float numHora = Float.parseFloat(JOptionPane
				.showInputDialog("Quantas horas você trabalha por mês:"));

		salario = (ganhoHora * numHora);
		float IR = (salario * 11)/100;
		float inss = (salario * 8)/100;
		float sindicato = (salario * 5)/100;
		float salarioLiquido = (salario - (inss + sindicato + IR));

		JOptionPane.showMessageDialog(null, "O seu Salario bruto é: R$ " + salario
				+ "\n" + "Você pago ao INSS: R$ " + inss + "\n"
				+ "Foi descontado de IR: "+ IR + "\n"
				+ "Você pagou ao Sindicato: R$ " + sindicato + "\n"
				+ "O seu Salario líquido é de: R$ " + salarioLiquido);

	}

}
