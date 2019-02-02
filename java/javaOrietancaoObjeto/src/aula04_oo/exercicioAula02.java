package aula04_oo;

import javax.swing.JOptionPane;

public class exercicioAula02 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Calcule o valor de volume...");

        float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de raio: "));

        float volume = (float) (((4 * 3.14) * Math.pow(raio, 3)) / 3);

        JOptionPane.showMessageDialog(null, "O valor de volume é: " + volume);

    }

}
