package com.loiane.cursojava.exerciciosComplementar;

import javax.swing.JOptionPane;

public class exercicio03 {

	public static void main(String[] args) {
		String sexo = null, corDosOlhos = null, corDosCabelos = null;
		String sexoM = "sexo Masculino", sexoF = "sexo Feminino";
		String corDosCabelosL = null, corDosCabelosC, corDosCabelosP;
		String corDosOlhosA, corDosOlhosC, corDosOlhosV = null;
		int idade = 0, maior = Integer.MIN_VALUE, i, cont = 0;
		float soma = 0, percentual = 0;

		int qtdPessoas = Integer.parseInt(JOptionPane
				.showInputDialog("Digite quantas pessoas são da cidade"));

		for (i = 0; i < qtdPessoas; i++) {

			idade = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a idade da " + (i + 1)
							+ "ª pessoa."));

			do {
				if (idade > maior) {
					maior = idade;
				}

				if (idade >= 18 && idade <= 35) {
					cont++;
				} else if (idade >= 90 && idade <= 0) {
					JOptionPane.showMessageDialog(null, "Idade inexistente");
				}

			} while (idade >= 18 && idade <= 35);

			do {
				sexo = JOptionPane
						.showInputDialog("Insira o sexo da "
								+ (i + 1)
								+ "ª pessoa se: \n M para Masculino \n F para Feminino");

				switch (sexo) {
				case "M":
				case "m":
					JOptionPane.showMessageDialog(null, "Sexo Masculino");
					break;
				case "F":
				case "f":
					JOptionPane.showMessageDialog(null, "Sexo Feminino");
					cont++;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Sexo Inexistente");
				}
			} while (!(sexo.equals("M")) && !(sexo.equals("f"))
					&& !(sexo.equals("m")) && !(sexo.equals("F")));
			// TEste de Sexo

			do {
				corDosCabelos = JOptionPane
						.showInputDialog("Escolha a cor dos cabelos da "
								+ (i + 1)
								+ "ª pessoa"
								+ " com as opções: \n L para Louros \n C para Castanhos \n P para pretos");
				switch (corDosCabelos) {
				case "l":
				case "L":
					corDosCabelosL = "Cabelos Louros";
					cont++;
					break;
				case "c":
				case "C":
					corDosCabelosC = "Cabelos Castanhos";
					break;
				case "p":
				case "P":
					corDosCabelosP = "Cabelos Pretos";
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"Cor de Cabelo Inexistente");
				}
			} while (!(corDosCabelos.equals("l"))
					&& !(corDosCabelos.equals("L"))
					&& !(corDosCabelos.equals("c"))
					&& !(corDosCabelos.equals("C"))
					&& !(corDosCabelos.equals("p"))
					&& !(corDosCabelos.equals("P")));
			// Testes Cor de Cabelos

			do {
				corDosOlhos = JOptionPane
						.showInputDialog("Escolha a cor dos Olhos da "
								+ (i + 1)
								+ "ª pessoa"
								+ " com as opções:\n A para Azuis \n  C para Castanhos \n  V para verdes");
				switch (corDosOlhos) {
				case "a":
				case "A":
					corDosOlhosA = "Olhos Azuis";

					break;
				case "c":
				case "C":
					corDosOlhosC = "Olhos Castanhos";
					break;
				case "v":
				case "V":
					corDosOlhosV = "Olhos Verdes";
					cont++;
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"Cor de Olhos inexistente");
				}
			} while (!(corDosOlhos.equals("a")) && !(corDosOlhos.equals("A"))
					&& !(corDosOlhos.equals("c")) && !(corDosOlhos.equals("C"))
					&& !(corDosOlhos.equals("v")) && !(corDosOlhos.equals("V")));
			// Teste de Cor dos Olhos

			if (idade >= 18 && idade <= 35 && sexo.equals("f")
					|| sexo.equals("F") && corDosCabelos.equals("l")
					|| corDosCabelos.equals("L") && corDosOlhos.equals("v")
					|| corDosOlhos.equals("V")) {
				soma = (cont / 4);
				percentual = (soma * 100) / qtdPessoas;

			}

		}

		JOptionPane
				.showMessageDialog(
						null,
						"A idade maior de todos os habitantes é: "
								+ maior
								+ " anos "
								+ "\n E a percentagem de sexo feminino entre 18 e 35 anos é: "
								+ percentual + " % ");

	}
}
