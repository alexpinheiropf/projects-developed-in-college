package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio07 {

	public static void main(String[] args) {
		float quadrado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do tamanho da quadrado: "));
		float area = quadrado * quadrado;
		JOptionPane.showMessageDialog(null, "A area do quadrado é: " + area);
	
	}

}
