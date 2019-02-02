/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_oo;

/**
 *
 * @author Alex
 */
public class Variavel {

    public static void main(String[] args) {
        
        final String exemplo_const;
       
        int valor1 = 1;
        int valor2 = 2;
        int valor3 = 3;
        int auxiliar;

        // continuar a execução
        // Ao final valor1 = 3, valor2 = 1 e valor3 = 2

        auxiliar = valor1;
        valor1 = valor3;
        valor3 = valor2;
        valor2 = auxiliar;

        System.out.println("Valor 1 : " + valor1);
        System.out.println("Valor 2 : " + valor2);
        System.out.println("Valor 3 : " + valor3);

    }

}
