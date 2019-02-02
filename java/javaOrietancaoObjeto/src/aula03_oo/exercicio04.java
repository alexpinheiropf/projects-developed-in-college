package aula03_oo;

import javax.swing.JOptionPane;

public class exercicio04 {

    public static void main(String[] args) {
        float nota01, nota02, nota03, media;

        String aluno = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
        nota01 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 1 do aluno " + aluno));
        nota02 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 2 do aluno " + aluno));
        nota03 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 2 do aluno " + aluno));
        
        media = (nota01 + nota02 + nota03) / 3;

        if (media > 7) {
            JOptionPane.showMessageDialog(null, "O aluno " + aluno + " está aprovado com média: " + media);
        } else if (media < 7 && media > 5) {
            
            JOptionPane.showMessageDialog(null,"O aluno " + aluno + " está em recuperação com média: "  + media);            
        } else {
            
            JOptionPane.showMessageDialog(null, "O aluno " + aluno + " está reprovado com média: "+ media);
        }
    }

}
