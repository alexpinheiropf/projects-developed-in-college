package exerciciosLista03;

import javax.swing.JOptionPane;

public class Cliente extends Biblioteca {

    public String nomeCliente, sobreNome, nomeCompleto;
    public Livro[] vetLivrosAlugados;

    
    public void infoCliente() {
        nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente");
        sobreNome = JOptionPane.showInputDialog("Informe o sobrenome do cliente");

        nomeCompleto = nomeCliente + " " + sobreNome;

    }

    public void info() {
        System.out.println("O cliente " + this.nomeCompleto + " alugou o livro " + vetLivrosAlugados);
    }

    public void livrosAlugados() {
        for (int i = 0; i < this.vetLivrosAlugados.length; i++) {
            this.vetLivrosAlugados[i].infoLivro();
        }

    }
}
