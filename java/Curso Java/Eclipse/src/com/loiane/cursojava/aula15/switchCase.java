package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int diasSemana = scan.nextInt();

		if (diasSemana == 1) {
			System.out.println("Domingo");
		} else if (diasSemana == 2) {
			System.out.println("Segunda");
		} else if (diasSemana == 3) {
			System.out.println("ter�a");
		} else if (diasSemana == 4) {
			System.out.println("Quarta");
		} else if (diasSemana == 5) {
			System.out.println("Quinta");
		} else if (diasSemana == 6) {
			System.out.println("Sexta");
		} else if (diasSemana == 7) {
			System.out.println("Sabado");
		} else {
			System.out.println("N�o � dia da semana");
		}

		// Limpando o c�digo
		
		switch (diasSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("N�o � dia da semana");
			
		}
	}

}
