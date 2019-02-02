package exerciciosLista02;

import javax.swing.JOptionPane;

public class Exercicio01 {

    private String nomeAluno;
    private float nota1, nota2, nota3, media;

    public void nomeAluno() {
        nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
    }

    public void notasMedia() {
       // nomeAluno();

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota do " + nomeAluno));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota do " + nomeAluno));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3ª nota do " + nomeAluno));

        media = (nota1 + nota2 + nota3) / 3;

    }

    public void media() {
        //notasMedia();
        if (media <= 5) {
            JOptionPane.showMessageDialog(null, "O aluno " + nomeAluno + " recebeu media " + media + " está reprovado");
        } else if (media > 5 && media <= 6.9) {
            JOptionPane.showMessageDialog(null, "O aluno " + nomeAluno + " recebeu media " + media + " está em recuperação");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno "
                    + "" + nomeAluno + " recebeu media " + media + " está aprovado");
        }
    }

    public void info() {
        nomeAluno();
        notasMedia();
        media();
    }

    public static void main(String[] args) {

        Exercicio01 objAluno = new Exercicio01();
        objAluno.info();

    }
}
