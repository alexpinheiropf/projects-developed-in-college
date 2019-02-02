/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_oo;

/**
 *
 * @author Alex
 */
public class MainAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        float[] vetor = new float[3];
        vetor[0] = 7.5f;
        vetor[1] = 9.0f;
        vetor[2] = 8.7f;

        aluno.setVetNotas(vetor);

        for (int i = 0; i < aluno.getVetNotas().length; i++) {
            System.out.println(aluno.getVetNotas()[i]);
        }
    }

}
