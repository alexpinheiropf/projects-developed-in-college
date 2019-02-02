package exerciciosListaComplementar;

import javax.swing.JOptionPane;

public class Credito {

    float salarioAnual, salarioMedio = 0, valorCredito = 0, valorTotalCredito = 0;
    int i = 0, x = 0, credito = 0;
    int[] salarioMes = new int[12];
    String cliente;
    float somaSalarioMes = 0;
    String[] salMedio = new String[4];

    public void nomeCliente() {
        cliente = JOptionPane.showInputDialog("Digite o nome do Cliente");
    }

    public void salarioMensal() {

        for (; i < 12; i++) {
            salarioMes[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario do " + (i + 1) + "º mês"));

            somaSalarioMes += salarioMes[x];
            salarioMedio = (somaSalarioMes / 12);

            System.out.println("O salario do " + cliente + " referente do "
                    + (i + 1) + "º mês é R$ " + salarioMes[x]);
        }
    }

    public void credito() {

        if (salarioMedio < 0) {
            JOptionPane.showMessageDialog(null, " O salário está em falta");

        } else if (salarioMedio == 0 || salarioMedio <= 200) {
            valorCredito = 0;
            salMedio[0] = "nenhum crédito";
            salMedio[x] = salMedio[0];

        } else if (salarioMedio >= 201 || salarioMedio <= 400) {
            valorCredito = (salarioMedio * 20) / 100;
            salMedio[1] = "20 % do valor do saldo médio";
            salMedio[x] = salMedio[1];

        } else if (salarioMedio >= 401 || salarioMedio <= 60) {
            valorCredito = (salarioMedio * 30) / 100;
            salMedio[2] = "30 % do valor do saldo médio";
            salMedio[x] = salMedio[2];

        } else if (salarioMedio >= 601) {
            valorCredito = (salarioMedio * 40) / 100;
            salMedio[3] = "40 % do valor do saldo médio";
            salMedio[x] = salMedio[3];
        }
        valorTotalCredito = salarioMedio + valorCredito;

        JOptionPane.showMessageDialog(null, "O saldo médio do cliente " + cliente
                + " é R$ " + salarioMedio + " \n A sua porcentagem é de " + salMedio[x]
                + " \n O seu valor de crédito é de R$ " + valorTotalCredito);

    }

    public void resolucao() {
        nomeCliente();
        salarioMensal();
        credito();
    }

    public static void main(String[] args) {
        Credito objCred = new Credito();
        objCred.resolucao();
    }
}
