
package aula07_oo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ponto2D {
    
    private float x, y;
    
     public void qualPonto(){
        x = Float.parseFloat(JOptionPane.showInputDialog("Digite o Eixo X: "));
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite o Eixo Y: "));
   
        if (x > 0 && y > 0){
            JOptionPane.showMessageDialog(null,"O ponto está no quadrante Q1 ");
        }else if(x < 0 && y > 0){
            JOptionPane.showMessageDialog(null,"O ponto está no quadrante Q2 ");
        }else if (x == 0 && y == 0){    
            JOptionPane.showMessageDialog(null, "O ponto está na Origem");
        }else if( x < 0 && y < 0){
            JOptionPane.showMessageDialog(null,"O ponto está no quadrante Q3 ");
        }else if(x > 0 && y < 0){
            JOptionPane.showMessageDialog(null,"O ponto está no quadrante Q4 ");
        }else if(x == 0 && y != 0 ){
            JOptionPane.showMessageDialog(null,"O ponto está no eixo Y ");
        }else{
            JOptionPane.showMessageDialog(null,"O ponto está no eixo X ");
        }
    }
   
}
