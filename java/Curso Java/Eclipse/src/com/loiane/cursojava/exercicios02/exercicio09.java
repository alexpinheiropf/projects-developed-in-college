package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o 1� numero");
		int num1 = scan.nextInt();
		System.out.println("Digite o 2� numero");
		int num2 = scan.nextInt();
		System.out.println("Digite o 3� numero");
		int num3 = scan.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.println("Os numeros em Decrescente s�o : \n" + num1
					+ "\n" + num2 + "\n" + num3);
		} else if (num2 > num3 && num3 > num1) {
			System.out.println("Os numeros em Decrescente s�o : \n" + num2
					+ "\n" + num3 + "\n" + num1);

		} else if (num3 > num2 && num2 > num1) {
			System.out.println("Os numeros em Decrescente s�o : \n" + num3
					+ "\n" + num2 + "\n" + num1);
		}
		
		if (num3 == num2 || num3 == num1 || num1 == num2) {
			System.out
					.println("Tem numero repitidos n�o podera fazer o decrescente");

		}
	}

}
