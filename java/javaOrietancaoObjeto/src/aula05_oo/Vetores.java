package aula05_oo;

import javax.swing.JOptionPane;

public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float[] vetMedias = new float[2];
        int x;
        float nota1, nota2, media;
        for (x = 0; x < vetMedias.length; x++) {
            float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1 do aluno: " + x));
            float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2 do aluno: " + x));

            vetMedias[x] = (n1 + n2) / 2;
        }
        for (x = 0; x < vetMedias.length; x++) {
            System.out.println("A média do aluno " + x + " é " + vetMedias[x]);
        }
        
    }

}
