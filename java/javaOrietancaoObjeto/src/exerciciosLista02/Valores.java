package exerciciosLista02;

import javax.swing.JOptionPane;

public class Valores {

    private int[] vetValor = new int[10];
    private int  qtdNumIntervalo = 0;

    public void informeValor() {

        for (int i = 0; i < vetValor.length; i++) {
            vetValor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "º numero"));

            if (vetValor[i] >= 30 && vetValor[i] <= 60) {
                qtdNumIntervalo++;
            }

        }

    }

    public void imprimirValor() {
        informeValor();

        if (qtdNumIntervalo > 0) {

            System.out.println("A quantidade de valores entre 30 e 60 é: " + qtdNumIntervalo);

            for (int i = 0; i < vetValor.length; i++) {
                if (vetValor[i] >= 30 && vetValor[i] <= 60) {

                    System.out.println("O valor dos " + qtdNumIntervalo + " nºs são: " + vetValor[i]);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe nenhum numero no intervalo");
        }

    }

    public static void main(String[] args) {
        Valores objValor = new Valores();

        objValor.imprimirValor();
    }

}
