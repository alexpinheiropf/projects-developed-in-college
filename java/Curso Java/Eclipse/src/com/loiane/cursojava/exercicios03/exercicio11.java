package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio11 {

	public static void main(String[] args) {
		int num1, num2, i, soma = 0;
		do {
			num1 = Integer.parseInt(JOptionPane
					.showInputDialog(" Insira um valor:"));
			num2 = Integer.parseInt(JOptionPane
					.showInputDialog(" Insira outro valor:"));
			if (!(num1 < num2)) {
				JOptionPane.showMessageDialog(null, "Digite novamente!!!");
			}
			for (i = num1; i <= num2; i++) {
				
				System.out.println(i);
				soma += i;
			}
		} while (!(num1 < num2));
		
		System.out.println(soma);
	}

}
