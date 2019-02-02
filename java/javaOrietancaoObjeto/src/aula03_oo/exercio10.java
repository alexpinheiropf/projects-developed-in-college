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
public class exercio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
        if (numero >= 100 && numero <= 200){
            JOptionPane.showMessageDialog(null, "O numero está entre o Valor 100 e o 200");
        } else {
            JOptionPane.showMessageDialog(null, "O numero não está no Intervalo entre 100 e 200");
        }
        
                 
    }
    
}
