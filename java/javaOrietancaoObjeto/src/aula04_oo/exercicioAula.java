package aula04_oo;

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
        float media = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da media: "));
        
        String situacao = media>= 70 ? "Aprovado": media <= 50 ? "Reprovado": "Recuperação";
        
                
        JOptionPane.showMessageDialog(null, situacao);
        
    }
    
}
