
package aula03_oo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1, nota2, media, nota3;
        JOptionPane.showMessageDialog(null, "A média para passar é 7");
        String  aluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota 01: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota 02: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota 03: "));
        
        media = ((nota1 + nota2 + nota3) / 3);
        
        
        if (media >= 7f){
            JOptionPane.showMessageDialog(null, "O Aluno " + aluno + " está aprovado com média: " + media);
        }else if(media <=5f){        
              JOptionPane.showMessageDialog(null, "O Aluno "+ aluno + " está reprovado com média: " + media);  
            } else{
                JOptionPane.showMessageDialog(null, "O Aluno " + aluno + " está em recuperação com média: " + media);
        }
            
        }
    }

