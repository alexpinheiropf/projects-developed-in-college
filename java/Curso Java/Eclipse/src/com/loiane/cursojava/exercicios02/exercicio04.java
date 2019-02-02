package com.loiane.cursojava.exercicios02;

import javax.swing.JOptionPane;

public class exercicio04 {

	public static void main(String[] args) {
		String letra, numero = null;

		letra = JOptionPane.showInputDialog(null,
				"Digite uma letra do alfabeto: ");

		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			JOptionPane.showMessageDialog(null, "Você digitou uma vogal");
			break;
			
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0":
			JOptionPane.showMessageDialog(null, "Você digitou um numero");
			break;

		case "!":
		case "@":
		case "#":
		case "$":
		case "%":
		case "¨¨":
		case "*":
		case "&":
		case "(":
		case ")":
		case "{":
		case "}":
		case "[":
		case "]":
			JOptionPane.showMessageDialog(null, "Você digitou um caracter");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Você digitou uma consoante");
			break;
		}

	}
}
