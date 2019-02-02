package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio08 {

	public static void main(String[] args) {
		int num,i;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		float media;
		
		for(i = 0; i < 5; i++){
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:" + i));
			
			soma += num;
		}

		media = (soma /5);
		JOptionPane.showMessageDialog(null, "A soma deu: " + soma + "\n" +
		" E a média deu: " + media);
	}

}
