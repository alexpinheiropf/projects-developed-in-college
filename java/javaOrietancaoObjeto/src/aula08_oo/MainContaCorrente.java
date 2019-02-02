package aula08_oo;

import javax.swing.JOptionPane;

public class MainContaCorrente {

    public static void main(String[] args) {
        /*
         ContaCorrente c1 = new ContaCorrente("Fulano");
         ContaCorrente c2 = new ContaCorrente("Ciclano", 1000);
        
         int totalContas = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de contas"));
         ContaCorrente[] vetContas = new ContaCorrente[totalContas];
        
         for (int i = 0; i < vetContas.length; i++) {
         String nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
         float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));
         vetContas[i] = new ContaCorrente(nome, saldo);

         }

         c1.depositar(2600.52f);
         c1.imprimirDados();
         c2.imprimirDados();

         c2.sacar(950.20f);
         c2.imprimirDados();
        

         }
         */
        ContaCorrente cc = new ContaCorrente();
        String[] vetor = new String[3];
        vetor[0] = "Primeira pos";
        vetor[1] = "Segunda pos";
        vetor[2] = "Terceira pos";

        vetor = cc.teste(vetor);
        for (int i = 0; i < vetor.length; i++) {
            

        }
    }

}
