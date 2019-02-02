package aula05_oo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] vetNum = new float[10];
        int x;
        for (x = 0; x < vetNum.length; x++) {
            vetNum[x] = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + (x + 1) + "º numero"));
        }
        for (x = 0; x < vetNum.length; x++) {
            if (vetNum[x] >= 0) {
                JOptionPane.showMessageDialog(null,vetNum[x] + " é positivo.");
                
            }else {
                JOptionPane.showMessageDialog(null,vetNum[x] + " é negativo.");
            }
        }

    }
}
