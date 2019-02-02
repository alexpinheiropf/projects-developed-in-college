package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio03 {

	public static void main(String[] args) {
		String nome, sexo, sexoEscolhidoM = "Masculino", estadoCivil, sexoEscolhidoF = "Feminino", sexoEscolhido = null;
		String nomeC = null, estCivEsc = null;
		String estCivEscC = "Casado(a)", estCivEscS = "Solteiro(a)", estCivEscV = "Viúvo(a)", estCivEscD = "Divorciado(a)";
		int idade;
		int idadeC = 0;
		float salario, salarioC = 0;

		do {
			nome = JOptionPane.showInputDialog("Digite seu nome");

			if (nome.length() <= 3) {
				JOptionPane.showMessageDialog(null,
						"O nome inserido é muito curto"
								+ "\n Digite um nome maior que 3 letras");
			} else if (nome.length() > 3) {
				nomeC = nome;
			}
		} while (!(nome.length() > 3));

		do {

			idade = Integer.parseInt(JOptionPane
					.showInputDialog("Digite sua idade"));

			if ((idade > 0) && (idade <= 150)) {
				idadeC = idade;

			} else if (!(idade > 0 && idade < 150)) {
				JOptionPane.showMessageDialog(null, "Idade inexitente"
						+ "\n Digite novamente");
			}

		} while (!(idade > 0 && idade < 150));

		do {
			salario = Float.parseFloat(JOptionPane
					.showInputDialog("Digite seu salario"));

			if (salario <= 0) {
				JOptionPane.showMessageDialog(null, "O salario eh invalido"
						+ "\n Insira-o novamente");
			} else if (salario > 0) {

				salarioC = salario;
			}
		} while (!(salario > 0));

		do {

			sexo = JOptionPane
					.showInputDialog("Digite seu sexo F para Feminino e"
							+ " M p/ Masculino");

			switch (sexo) {
			case "m":
			case "M":
				sexoEscolhido = sexoEscolhidoM;
				break;
			case "f":
			case "F":
				sexoEscolhido = sexoEscolhidoF;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Sexo Inválido \n Digite novamente Correto!!!");
			}
		} while (!(sexo.equals("M")) && !(sexo.equals("m"))
				&& !(sexo.equals("f")) && !(sexo.equals("F")));

		do {

			estadoCivil = JOptionPane
					.showInputDialog("Digite seu estado civil:"
							+ " \n C para casado(a) \n S para Solteiro(a) "
							+ "\n V para Viúdo(a) \n" + "D para Divociado(a)");

			switch (estadoCivil) {
			case "s":
			case "S":
				estCivEsc = estCivEscS;
				break;
			case "c":
			case "C":
				estCivEsc = estCivEscC;
				break;
			case "v":
			case "V":
				estCivEsc = estCivEscV;
				break;
			case "d":
			case "D":
				estCivEsc = estCivEscD;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Estado Civil Errado \n Digite novamente Correto!!!");
			}

		} while (!(estadoCivil.equals("s")) && !(estadoCivil.equals("S"))
				&& !(estadoCivil.equals("c")) && !(estadoCivil.equals("C"))
				&& !(estadoCivil.equals("v")) && !(estadoCivil.equals("V"))
				&& !(estadoCivil.equals("d")) && !(estadoCivil.equals("D")));

		JOptionPane.showMessageDialog(null, "O seu nome é: " + nomeC + "\n"
				+ "Sua idade é de: " + idadeC + " anos \n" + "O seu salário é de: R$ "
				+ salarioC + "\n" + "O seu sexo é: " + sexoEscolhido + "\n"
				+ "O Seu estado Civil é: " + estCivEsc);

	}

}
