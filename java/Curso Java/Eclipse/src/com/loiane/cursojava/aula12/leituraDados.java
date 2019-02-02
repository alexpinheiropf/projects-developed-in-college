package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class leituraDados {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite seu nome Completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome Completo é: " + nomeCompleto);
		
		System.out.println("Digite seu Primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu Primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		
		

		
	}

}
