package exerciciosLista03;

import javax.swing.JOptionPane;

public class Triangulo {

    private float ladoA, ladoB, ladoC;

    public void tiposTriangulo() {
        
        if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
            JOptionPane.showMessageDialog(null, "O triângulo é equilátero com o valor dos lados: \n lado A: " + ladoA + "\n"
                    + "lado B: " + ladoB + "\n" + "lado C: " + ladoC);

        } else if ((ladoA == ladoB && ladoA != ladoC)
                || (ladoB == ladoC & ladoB != ladoA)
                || (ladoC == ladoA && ladoC != ladoB)) {
            JOptionPane.showMessageDialog(null, "O triângulo é isóceles com o valor dos lados: \n lado A: " + ladoA + "\n"
                    + "lado B: " + ladoB + "\n" + "lado C: " + ladoC);

        } else if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) {
            JOptionPane.showMessageDialog(null, "Isso não é um triângulo");

        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            JOptionPane.showMessageDialog(null, "O triângulo é iscaleno com o valor dos lados: \n lado A: " + ladoA + "\n"
                    + "lado B: " + ladoB + "\n" + "lado C: " + ladoC);
        }
    }
    
    public void informeLados(){
        ladoA = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do lado A"));
        ladoB = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do lado B"));
        ladoC = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do lado C"));

        tiposTriangulo();
    }
}
