
package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio07 {

	public static void main(String[] args) {

		int num = 0, i;
		int maior = Integer.MIN_VALUE;
		

		for (i = 0; i < 5; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero " + i));
			if(num > maior){
				maior = num;
			}
		}
		System.out.println("O numero maior é: " + maior);
	}

}
