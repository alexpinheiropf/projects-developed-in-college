/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_oo;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       float grausC, grausF;
       
       System.out.println("Digite a temperatura em graus C: ");
       grausC = Float.parseFloat(scan.next());
       // F=(9*C+160) / 5
       grausF = ((9 * grausC + 160) / 5);
       System.out.println(grausC + "C  em Fahrenheit é " + grausF + " F" );
       
    }
    
}
