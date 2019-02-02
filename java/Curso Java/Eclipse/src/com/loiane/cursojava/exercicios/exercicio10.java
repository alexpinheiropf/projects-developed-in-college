package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio10 {

	public static void main(String[] args) {
		float celcius, farenheit;
		celcius = Float.parseFloat(JOptionPane.showInputDialog("Digite "
				+ "em celcius a temperatura: "));
		// °F = °C × 1,8 + 32
		farenheit = (float) ((celcius * 1.8) + 32);
		JOptionPane.showMessageDialog(null, "A temperatura em "
				+ "Farenheit é: " + farenheit);

	}

}
