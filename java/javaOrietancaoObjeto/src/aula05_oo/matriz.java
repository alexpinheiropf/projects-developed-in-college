package aula05_oo;

import javax.swing.JOptionPane;

public class matriz {

    public static void main(String[] args) {
        String[][] matriz = new String[5][3];
        int x, y;
        Float nota1, nota2, media;

        for (x = 0; x < matriz.length; x++) {

            matriz[x][0] = JOptionPane.showInputDialog("Digite um nome: ");

            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
            
            media = (nota1 + nota2) / 2;

            matriz[x][1] = media.toString();

        }

        for (x = 0; x < matriz.length; x++) {
            for (y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");

            }
            System.out.println();
        }
    }

}
