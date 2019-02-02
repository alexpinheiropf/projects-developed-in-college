package exerciciosLista02;

import javax.swing.JOptionPane;

public class ValoresNegativosEPositivos {

    public double[] vetNum = new double[10];
    public int i = 0, negativo = 0, positivo = 0;

    public void informeDados() {
        for (; i < vetNum.length; i++) {

            vetNum[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor"));

            if (vetNum[i] <= 0) {
                negativo++;
            } else if (vetNum[i] > 0) {
                positivo++;
            }
        }
    }

    public void imprimirDados() {
        informeDados();
        double[] vetNegativo = new double[negativo];
        double[] vetPositivo = new double[positivo];
        int j = 0;

        System.out.println("A quantidade de positivos são: " + positivo + " numeros");
        System.out.println("A quantidade de negativos são: " + negativo + " numeros");

        for (i = 0; i < vetNum.length; i++) {

            if (vetNum[i] <= 0) {
                vetNegativo[j] = vetNum[i];

                System.out.println("Os " + negativo + " valores negativos são: " + vetNegativo[j]);

            }
            
            if (vetNum[i] > 0) {

                vetPositivo[j] = vetNum[i];

                System.out.println("Os " + positivo + " valores positivo são: " + vetPositivo[j]);
            }

        }
    }

    public static void main(String[] args) {
        ValoresNegativosEPositivos objVal = new ValoresNegativosEPositivos();
        objVal.imprimirDados();
    }
}
