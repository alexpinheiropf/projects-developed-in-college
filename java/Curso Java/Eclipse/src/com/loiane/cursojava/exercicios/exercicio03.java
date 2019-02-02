package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num01 = scan.nextInt();
		
		
		System.out.println("Digite outro numero: ");
		int num02 = scan.nextInt();
		System.out.println("A soma dos numeros são:  " 
		                + (num02 + num01));
		
		

	}

}
