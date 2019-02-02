package com.loiane.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {

		int[][][] matrizTridimensional = new int[3][3][3];

		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int x = 0; x < matrizTridimensional[i][j].length; x++) {
					matrizTridimensional[i][j][x] = i + j + x;

				}
			}
		}
		int soma = 0;
		int somaPares = 0, somaImpares = 0;
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int x = 0; x < matrizTridimensional[i][j].length; x++) {
					soma += matrizTridimensional[i][j][x];

					if (matrizTridimensional[i][j][x] % 2 == 0) {
						somaPares += matrizTridimensional[i][j][x];
					} else {
						somaImpares += matrizTridimensional[i][j][x];

					}

				}
			}

		}

		System.out.println(" SomaTotal = " + soma + " \n Soma pares = " + somaPares
				+ "\n Soma Impares = " + somaImpares);
	}
}
