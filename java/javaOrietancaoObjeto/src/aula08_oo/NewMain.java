package aula08_oo;

import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        /*
         Aluno objAluno1 = new Aluno();
         Aluno objAluno2 = new Aluno();
        
         Aluno.totalAlunos = 1;
        
         objAluno1.imprimirTotalAlunos();
         objAluno2.imprimirTotalAlunos();
        
         Aluno.totalAlunos = 5;
        
         objAluno1.imprimirTotalAlunos();
         objAluno2.imprimirTotalAlunos();
        
         objAluno1.setAluno("Fulano", " de Tal");

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja cadastrar? "));

        if (qtd > 0) {
            Aluno[] vetAlunos = new Aluno[qtd];
            for (int i = 0; i < qtd; i++) {
                vetAlunos[i] = new Aluno();

                String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1));

                vetAlunos[i].setAluno(nome);
            }

            for (int i = 0; i < qtd; i++) {
                vetAlunos[i].imprimirNome();
            }
        }
        
       
        
        Aluno objAluno = new Aluno();
        objAluno.mediaAluno(8, 9);
        objAluno.mediaAluno(10, 10, 6, 5); */
        
        Aluno objAluno = new Aluno("Fulano", " de Tal", true);
        objAluno.imprimirDesc();
    }
    

}
