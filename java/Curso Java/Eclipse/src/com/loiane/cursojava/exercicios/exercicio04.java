package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String aluno = ler.nextLine();
		
		System.out.println("Digite a 1� nota do " + aluno);
		float nota1 = ler.nextFloat();
		System.out.println("Digite a 2� nota do " + aluno);
		float nota2 = ler.nextFloat();
		System.out.println("Digite a 3� nota do " + aluno);
		float nota3 = ler.nextFloat();
		System.out.println("Digite a 4� nota do " + aluno);
		float nota4 = ler.nextFloat();
		
	    float media;
	    
	    media = (nota1 + nota2 + nota3 + nota4) / 4;
	    
	    System.out.println("A m�dia do "+ aluno + " �: " + media);
		
		

	}

}
