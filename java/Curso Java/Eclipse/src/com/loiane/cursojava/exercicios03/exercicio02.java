package com.loiane.cursojava.exercicios03;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		String nomeCadastro, nome, senhaCadastro, senha;

		do {

			nomeCadastro = JOptionPane.showInputDialog("Cadastre um usuario");
			senhaCadastro = JOptionPane.showInputDialog("Cadastre uma senha");

			if (senhaCadastro.equals(nomeCadastro)) {
				JOptionPane.showMessageDialog(null,
						"Senha igual ao login \n Insira novamente");

			} else if (senhaCadastro != nomeCadastro) {
				JOptionPane.showMessageDialog(null,
						"O cadastro foi efetuado com sucesso");
			}

		} while (senhaCadastro.equals(nomeCadastro));

		do {

			nome = JOptionPane.showInputDialog("Digite o login usuário");
			senha = JOptionPane.showInputDialog("Insira a senha");

			if (!(nome.equals(nomeCadastro)) && !(senha.equals(senhaCadastro))) {

				JOptionPane.showMessageDialog(null,
						"Cadastro ou senha errado!!!" + " \n Insira novamente");

			} else if ((nome.equals(nomeCadastro))
					&& (senha.equals(senhaCadastro))) {
				JOptionPane.showMessageDialog(null, "Seja bem vindo "+ nome);
			}

		} while (!(nome.equals(nomeCadastro)) && !(senha.equals(senhaCadastro)));

	}
}
