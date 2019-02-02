package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("O valor de i: " + i);

		}// ou

		for (int i = 5; i >= 0; i--) {
			System.out.println("O valor de i: " + i);
		}// ou
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + " : j = " + j);
		}
		int count = 0;

		for (; count < 5;) {
			System.out.println("valor de count: " + count);
			count += 2;

		}

		for(int cont = 0; cont <10 ; cont +=2){
			System.out.println("Valor de cont: " + cont);
		}
	}
}
