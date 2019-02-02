package aula04_oo;

import javax.swing.JOptionPane;

public class laco {

    
    public static void main(String[] args) {
        float nota1, nota2, media;
        int num_Alunos = 0;
        while (num_Alunos < 50){
            
           nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1 do aluno " + num_Alunos));
           nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2 do aluno " + num_Alunos));
                     
           media = (nota1 + nota2) / 2;
           
           JOptionPane.showMessageDialog(null, "O Aluno " + num_Alunos + "obteve média " + media); 
           num_Alunos++;
        }
        
    }
    
}
