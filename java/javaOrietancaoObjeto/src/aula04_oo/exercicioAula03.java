package aula04_oo;

import javax.swing.JOptionPane;

public class exercicioAula03 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calcule as raízes de uma equação do  2º grau!!!");
        float a, b, c, x1, x2, delta;

        a = Float.parseFloat(JOptionPane.showInputDialog("Digite valor de a: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite valor de b: "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite valor de c: "));

        delta = (float) (Math.pow(b, 2) - 4 * a * c);

        if (delta <= 0) {

            JOptionPane.showMessageDialog(null, "Não existe raizes...");
        } else {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            JOptionPane.showMessageDialog(null, "O valor de X1 é: " + x1);
            JOptionPane.showMessageDialog(null, "O valor de X1 é: " + x2);

        }
    }

}
