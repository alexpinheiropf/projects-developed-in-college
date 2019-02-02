package exerciciosLista02;

import javax.swing.JOptionPane;

public class PontoPlano {

    private float x1, x2, y1, y2, d;

    public void informePontos() {
        x1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ponto x1"));
        x2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ponto x2"));
        y1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ponto y1"));
        y2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ponto y2"));

    }

    public void calculoFormula() {
        d = (float) Math.sqrt(Math.pow((x2-x1), 2) + (Math.pow((y2 - y1), 2)));
        System.out.println("O valor de pontos são: " + this.d);
    }
    
    public static void main (String[] args){
        PontoPlano objPlano = new PontoPlano();
        objPlano.informePontos();
        objPlano.calculoFormula();
    }

}
