package com.loiane.cursojava.exerciciosComplementar;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		float carroNovo;

		carroNovo = Float.parseFloat(JOptionPane
				.showInputDialog("Informe o valor de fabrica do carro"));

		float distribuidor = (carroNovo * 28) / 100;
		float imposto = (carroNovo * 45) / 100;
		float consumidor = carroNovo + (distribuidor + imposto);

		JOptionPane.showMessageDialog(null, "O valor de fabrica do carro "
				+ "�: R$ " + carroNovo + " \n A percentgem do Distribuidor �: R$ "
				+ distribuidor + "\n O imposto posto emcima � de: R$ " + imposto
				+ " \n " + "O valor ao consumidor �: R$ " + consumidor);

	}

}
