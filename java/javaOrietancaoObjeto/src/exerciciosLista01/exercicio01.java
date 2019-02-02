/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosLista01;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1  = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        int num2  = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:"));
       int soma = (num1 + num2);
       JOptionPane.showMessageDialog(null, "O a soma dos numeros são: " + soma);
       
    }
    
}
