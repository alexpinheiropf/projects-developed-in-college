package aula05_oo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] vetNum = new float[10];
        int x, count = 0;
        for (x = 0; x < vetNum.length; x++) {
            vetNum[x] = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + (x + 1) + "º numero"));
        }
        for (x = 0; x < vetNum.length; x++) {
            if (vetNum[x] >= 30 && vetNum[x] <= 60) {
                count++;
            }

        }
        JOptionPane.showMessageDialog(null, count + " estão entre 30 e 60");
/*
        if (count > 0) {
            float[] vetNumIntervalo = new float[count];
            int y = 0;

            for (x = 0; x < vetNum.length; x++) {
                if (vetNum[x] >= 30 && vetNum[x] <= 60) {
                    vetNumIntervalo[y] = vetNum[x];
                    y++;
                }
            }
            System.out.println("Numeros que estão no intervalo entre 30 e 60: ");
            for (x = 0; x < vetNumIntervalo.length; x++) {
                System.out.println(vetNumIntervalo[x]);*/

            }

        }
   // }

//}
