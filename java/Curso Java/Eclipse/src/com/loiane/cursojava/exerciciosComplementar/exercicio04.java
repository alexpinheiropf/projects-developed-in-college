package com.loiane.cursojava.exerciciosComplementar;

import javax.swing.JOptionPane;

public class exercicio04 {

	public static void main(String[] args) {
		float salarioAnual, salarioMedio = 0, valorCredito = 0, valorTotalCredito = 0;
		int i = 0, x = 0, credito = 0;
		int[] salarioMes = new int[12];
		String cliente;
		float somaSalarioMes = 0;
		String[] salMedio = new String[4];

		cliente = JOptionPane.showInputDialog("Digite o nome do Cliente");

		for (; i < 12; i++) {
			salarioMes[x] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o sal�rio referente ao " + (i + 1)
							+ "� m�s do ano"));

			somaSalarioMes += salarioMes[x];

			salarioMedio = (somaSalarioMes / 12f);

			System.out.println("O salario do " + cliente + " referente do "
					+ (i + 1) + "� m�s � R$ " + salarioMes[x]);
		}
		if (salarioMedio < 0) {
			JOptionPane.showMessageDialog(null, " O sal�rio est� em falta");
			
		} else if (salarioMedio == 0 || salarioMedio <= 200) {
			valorCredito = 0;
			salMedio[0] = "nenhum cr�dito";
			salMedio[x] = salMedio[0];
			
		} else if (salarioMedio >= 201 || salarioMedio <= 400) {
			valorCredito = (salarioMedio * 20) / 100;
			salMedio[1] = "20 % do valor do saldo m�dio";
			salMedio[x] = salMedio[1];
			
		} else if (salarioMedio >= 401 || salarioMedio <= 60) {
			valorCredito = (salarioMedio * 30) / 100;
			salMedio[2] = "30 % do valor do saldo m�dio";
			salMedio[x] = salMedio[2];
			
		} else if (salarioMedio >= 601) {
			valorCredito = (salarioMedio * 40) / 100;
			salMedio[3] = "40 % do valor do saldo m�dio";
			salMedio[x] = salMedio[3];
		}
		valorTotalCredito = salarioMedio + valorCredito;
		
		JOptionPane.showMessageDialog(null, "O saldo m�dio do cliente " + cliente +
				" � R$ " + salarioMedio + " \n A sua porcentagem � de " + salMedio[x] +
				" \n O seu valor de cr�dito � de R$ " + valorTotalCredito );

	}
	

}
