package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String aluno = ler.nextLine();
		
		System.out.println("Digite a 1ª nota do " + aluno);
		float nota1 = ler.nextFloat();
		System.out.println("Digite a 2ª nota do " + aluno);
		float nota2 = ler.nextFloat();
		System.out.println("Digite a 3ª nota do " + aluno);
		float nota3 = ler.nextFloat();
		System.out.println("Digite a 4ª nota do " + aluno);
		float nota4 = ler.nextFloat();
		
	    float media;
	    
	    media = (nota1 + nota2 + nota3 + nota4) / 4;
	    
	    System.out.println("A média do "+ aluno + " é: " + media);
		
		

	}

}
