package exerciciosLista02;

import javax.swing.JOptionPane;

public class ValorProduto {

    private float precoCusto, valorVenda, percentual, precoCustoP;

    public void produto() {
        precoCusto = Float.parseFloat(JOptionPane.
                showInputDialog("Informe o valor do preço de custo do produto"));

        percentual = Float.parseFloat(JOptionPane.
                showInputDialog("Informe o percentual que vai emcima do produto"));

    }

    public void calculo() {
        precoCustoP = (precoCusto * percentual) / 100;

        valorVenda = (precoCusto + precoCustoP);

    }

    public void info() {
        produto();
        calculo();
        JOptionPane.
                showMessageDialog(null, "O preço final do produto é R$ " + valorVenda);
    }

    public static void main(String[] args) {
        ValorProduto objProd = new ValorProduto();
        objProd.info();
    }

}
