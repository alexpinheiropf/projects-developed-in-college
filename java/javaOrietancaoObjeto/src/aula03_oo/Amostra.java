/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_oo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Amostra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int amostra,idade;
        
        nome = JOptionPane.showInputDialog("Digite seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + " e você tem " + idade +" anos ");
        
    }
    
}
