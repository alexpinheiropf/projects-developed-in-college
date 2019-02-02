package com.loiane.cursojava.exercicios;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {
		 float metros;
		float centimetros = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor em centimetro"));
		 metros = centimetros/100;
		 JOptionPane.showMessageDialog(null, "O valor em metros é: " + metros +" m"); 
		
		 
		 

	}

}
