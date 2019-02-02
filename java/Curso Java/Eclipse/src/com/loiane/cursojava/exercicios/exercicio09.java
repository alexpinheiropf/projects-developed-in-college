package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio09 {

	public static void main(String[] args) {
		int celcius;
		int farenheit = Integer.parseInt(JOptionPane
				.showInputDialog("Digite " + "a temperatura em Farenheit: "));
		celcius = (5 * (farenheit - 32) /9);
		
		JOptionPane.showMessageDialog(null, "A temperatura em "
				+ "celcius é: " + celcius + "º");
	}

}
