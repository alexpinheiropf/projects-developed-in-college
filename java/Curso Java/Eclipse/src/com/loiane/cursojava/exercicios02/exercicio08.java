package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio08 {

	public static void main(String[] args) {
		float p1, p2, p3;

		p1 = Float.parseFloat(JOptionPane
				.showInputDialog("Diga o preço do produto 01: "));
		p2 = Float.parseFloat(JOptionPane
				.showInputDialog("Diga o preço do produto 02: "));
		p3 = Float.parseFloat(JOptionPane
				.showInputDialog("Diga o preço do produto 03: "));

		if (p1 < p2 && p1 < p3) {
			JOptionPane.showMessageDialog(null,
					"O produto 01 é mais barato pode comprar");
		} else if (p2 < p1 && p2 < p3) {
			JOptionPane.showMessageDialog(null,
					"O produto 02 é mais barato pode comprar");
		} else if (p3 < p2 && p3 < p1) {
			JOptionPane.showMessageDialog(null,
					"O produto 03 é mais barato pode comprar");
		}

	}

}
