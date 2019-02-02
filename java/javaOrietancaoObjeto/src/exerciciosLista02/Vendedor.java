package exerciciosLista02;

import javax.swing.JOptionPane;

public class Vendedor {

    private String nome;
    private float salarioFixo, salarioFinalMes, vendas, percentual;

    public void nomeVendedor() {
        nome = JOptionPane.showInputDialog("Digite o nome do Vendedor");
    }

    public void salario() {
        salarioFixo = Float.parseFloat(JOptionPane.
                showInputDialog("Digite o salario Fixo"));
        vendas = Float.parseFloat(JOptionPane.
                showInputDialog("Digite o valor das vendas"));

    }

    public void calculo() {
        percentual = (vendas + 15) / 100;
        salarioFinalMes = salarioFixo + percentual;

    }

    public void info() {
        nomeVendedor();
        salario();
        calculo();
        
        JOptionPane.
                showMessageDialog(null, "O vendedor " + nome
                        + " tem o salario fixo de " + salarioFixo
                        + " vendeu R$ " + vendas + " e ganhou 15% das vendas no "
                        + " total de R$ " + percentual + " e o salario total no "
                        + " final do mês foi R$ " + salarioFinalMes);
    }

    public static void main(String[] args) {
        Vendedor objSalario = new Vendedor();
        objSalario.info();
    }
}
