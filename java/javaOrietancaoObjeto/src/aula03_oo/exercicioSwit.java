package aula03_oo;

import javax.swing.JOptionPane;

public class exercicioSwit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: "));
        
        switch (opcao){
            
            case 50: 
                JOptionPane.showMessageDialog(null, "Escolha 50");
            break;
            
            case 87: 
                JOptionPane.showMessageDialog(null, "Escolha 87");
            break;    
                
            default:
               case 1: 
                JOptionPane.showMessageDialog(null, "Nenhuma das alternativas");
            break; 
              
                
        }
    }
    
}
