package exerciciosListaComplementar;

import javax.swing.JOptionPane;

public class Carro {

    private String modeloCarro;
    private double carroNovo, valorTotal;

    public void valorDeFabrica() {
        modeloCarro = JOptionPane.showInputDialog("Informe o modelo do Carro:");
        carroNovo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Fabrica do " + modeloCarro));

    }

    public void porcentagensCarro() {
        double distribuidor = (carroNovo * 28) / 100;
        double imposto = (carroNovo * 45) / 100;
        valorTotal = carroNovo + (distribuidor + imposto);

    }

    public void valorConsumidor() {
        valorDeFabrica();
        porcentagensCarro();
        JOptionPane.showMessageDialog(null, "O valor total do " + modeloCarro + " é R$ " + valorTotal);
    }

    public static void main(String[] args) {
        Carro objCar = new Carro();
        objCar.valorConsumidor();
    }
}
