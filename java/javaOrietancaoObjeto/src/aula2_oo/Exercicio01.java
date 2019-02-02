/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_oo;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int soma;

        System.out.println("Digite um numero:");

        num1 = Integer.parseInt(sc.next());

        System.out.println("Digite outro numero:");
        num2 = Integer.parseInt(sc.next());

        soma = num1 + num2;
        System.out.println("A soma dos dois numeros são: " + soma);

    }

}
