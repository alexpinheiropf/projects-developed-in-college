package com.loiane.cursojava.aula18;

public class Rotulo {

	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("rótulo3");
					}

					System.out.println("rótulo2");
				}
				System.out.println("rótulo1");
			}
		System.out.println(i);
		}

	}
}
