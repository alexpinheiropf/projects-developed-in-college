package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		int num1;
		num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite um numero: "));
		
		
		if (num1 > 0 ){
			
			JOptionPane.showMessageDialog(null, "O numero é positivo");
		}else{
			JOptionPane.showMessageDialog(null, "O numero é negativo");
		}

	}

}

