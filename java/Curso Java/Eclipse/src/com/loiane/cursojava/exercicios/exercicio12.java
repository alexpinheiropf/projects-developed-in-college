package com.loiane.cursojava.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class exercicio12 {

	public static void main(String[] args) {
		float altura, peso_Ideal;
		NumberFormat formatarFloat = new DecimalFormat("#.##");
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite "
				+ "a sua altura: "));
		peso_Ideal = (float) ((72.7 * altura) - 58);
		float peso = Float.parseFloat(formatarFloat.format(peso_Ideal).replace(",", "."));
		JOptionPane
				.showMessageDialog(null, "O seu peso ideal é: " + peso + " kilos");

	}

}
