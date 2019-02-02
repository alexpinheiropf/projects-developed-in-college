package com.alex.programa.hd;

import javax.swing.JOptionPane;

public class SoftwareHD {

	public static void main(String[] args) {
		String[] nomeFilial = null;
		int[] vetLigacaoTotal = null;
		int i = 0, opcao = 0, software = 0, hardware = 0, operacional = 0;

		JOptionPane.showMessageDialog(null, "Bom Dia tenha um ótimo dia");

		for (; i < nomeFilial.length; i++) {
			nomeFilial[i] = JOptionPane
					.showInputDialog("Digite o nome da Filial");
		}

		do {
			opcao = Integer
					.parseInt(JOptionPane
							.showInputDialog("Digite uma opção:"
									+ "\n 1 para Software \n 2 para Hardware \n 3 Operacional"));

			switch (opcao) {
			case 1:
				software++;
				break;
			case 2:
				hardware++;
				break;
			case 3:
				operacional++;
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"Opção Inválida\n Digite novamente!!!");
			}
		} while (opcao != 1 && opcao != 2 && opcao != 3);

	}
}
