package com.loiane.cursojava.aula19;

public class VetoresArrays {

	public static void main(String[] args) {

		float tempDia001 = 31.3f;
		float tempDia002 = 32f;
		float tempDia003 = 33.7f;
		float tempDia004 = 34f;
		float tempDia005 = 30f;

		float[] temperaturas = new float[365];
		temperaturas[0] = 31.3f;
		temperaturas[1] = 32f;
		temperaturas[2] = 33.7f;
		temperaturas[3] = 34f;
		temperaturas[4] = 30f;

		System.out.println("O valor da temperatura do dia " + "1 é "
				+ temperaturas[0]);

		System.out.println("O tamanho do array: " + temperaturas.length);

		System.out.println("Valores do Array: " + temperaturas);

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1)
					+ " é " + temperaturas[i]);
		}
		
		for(double temp: temperaturas){
			System.out.println(temp);
		}
		
	}

}
