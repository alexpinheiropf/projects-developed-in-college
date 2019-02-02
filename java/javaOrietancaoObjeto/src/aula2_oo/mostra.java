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
public class mostra {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float num;
        
        System.out.println("digite um numero: ");
        num = Float.parseFloat(scan.next());
        System.out.println("O numero é: " + num);
        
    }
    
}
