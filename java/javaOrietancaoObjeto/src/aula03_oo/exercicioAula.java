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
public class exercicioAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        
       nome = JOptionPane.showInputDialog("Digite seu nome: ");
       
       if (nome.isEmpty()){
           JOptionPane.showMessageDialog(null, "Você não digitou o nome!!");
           
       } else{
           
           JOptionPane.showMessageDialog(null, "Bem vindo seu nome: "+ nome);
       }
        
        
    }
    
}
