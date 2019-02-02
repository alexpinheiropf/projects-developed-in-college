package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio10 {

	public static void main(String[] args) {
		String opcao;
		String invalido = "Opção Invalida";
		do {

			opcao = JOptionPane.showInputDialog("Qual turno você estuda \n"
					+ " M - para Matutino \n N - Noturno \n V - Vespertino ");

			switch (opcao) {
			case "m":
			case "M":
				JOptionPane.showMessageDialog(null, "Bom dia");
				break;
			case "n":
			case "N":
				JOptionPane.showMessageDialog(null, "Boa Noite");
				break;
			case "v":
			case "V":
				JOptionPane.showMessageDialog(null, "Boa Tarde");
				break;
			default:
				JOptionPane.showMessageDialog(null, invalido);
				break;
			}
		} while (!(opcao.equals("M")) && !(opcao.equals("m")) && !(opcao.equals("v")) &&
				 !(opcao.equals("V")) && !(opcao.equals("n")) && !(opcao.equals("N")));
	}
}
