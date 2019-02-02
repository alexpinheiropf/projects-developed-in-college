package com.loiane.cursojava.exercicios03;

public class exercicio04 {

	public static void main(String[] args) {
		float a = 80000, b = 200000;
		int i = 0;

		do {
			a += (a * 3f) / 100;
			b += (b * 1.5f) / 100;
			i++;
		} while (a < b);

		System.out.println("A população de A é: " + a + "\n"
				+ "A poulação de B é: " + b + "\n" + "Os anos são: " + i);

	}

}
