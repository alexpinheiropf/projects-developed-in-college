/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_oo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        float num1, num2, soma, sub, mult, div;
        System.out.println("Digite o 1º numero: ");
        num1 = Float.parseFloat(sc.next());
        System.out.println("Digite o 2º numero: ");
        num2 = Float.parseFloat(sc.next());
        soma = num1 + num2;
        System.out.println("A soma dos numeros são: " + soma);
        sub = num1 - num2;
        System.out.println("A Subtração dos numeros são: " + sub);
        mult = num1 * num2;
        System.out.println("A Divisão dos numeros são: " + mult);
        div = num1 / num2;
        System.out.println("A Multiplicação dos numeros são: " + div);

    }

}
