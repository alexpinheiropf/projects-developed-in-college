package com.loiane.cursojava.aula13;

public class operadoresLogicos {

	public static void main(String[] args) {


		int valor1 =1;
		int valor2 =2;
		boolean resultado =(valor1 ==1) && (valor2 ==2);
		
		System.out.println("valor1 � 1 AND valor2 � 2 - resultado: " + resultado);

		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 � 1 OR valor2 � 2 - resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro  ^ falso);
		System.out.println(!verdadeiro && falso);
		

	}

}
