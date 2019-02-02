/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_oo;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author Alex
 */
public class exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num01, num02;
        
        num01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        num02 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        
        if (num01 > num02){
            
            JOptionPane.showMessageDialog(null, "O numero " + num01 + " é maior.");
            
        } else{
            
            JOptionPane.showMessageDialog(null, "O numero " + num02 + " é maior");
        }
           
        
      
        
    }
    
}

