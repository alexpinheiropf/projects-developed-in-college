package aula06_oo;

import javax.swing.JOptionPane;

public class exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] vetNum = new float[10];
        int x, qtdNumIntervalo = 0;

        for (x = 0; x < vetNum.length; x++) {
            vetNum[x] = Float.parseFloat(JOptionPane.showInputDialog(""
                    + "Digite o " + (x + 1) + " o numero: "));

            if (vetNum[x] >= 30 && vetNum[x] <= 60) {
                qtdNumIntervalo++;
            }
        }
        if (qtdNumIntervalo > 0) {
            float[] vetNumIntervalo = new float[qtdNumIntervalo];
            int y = 0;

            for (x = 0; x < vetNum.length; x++) {
                if (vetNum[x] >= 30 && vetNum[x] <= 60) {
                    vetNumIntervalo[y] = vetNum[x];
                    y++;
                }
            }

            String resultado = "";
            for (x = 0; x < vetNumIntervalo.length; x++) {
                resultado += vetNumIntervalo[x] + "\n";

            }
            JOptionPane.showMessageDialog(null, resultado);

        } else {
            JOptionPane.showMessageDialog(null, "Não existem números "
                    + "entre 30 e 60");
        }
    }

}
