package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite F ou M para Feminino ou Masculino \n");
		String input = scan.next();

		do {
			if (input.equalsIgnoreCase("f")) {
				System.out.println("Sexo Feminino \n ");
			} else if (input.equalsIgnoreCase("m")) {
				System.out.println("Sexo Masculino \n");
			} else {
				System.out.println("Sexo Invalido \n");
			}
		} while (input == "f" || input == "m");
	}
}