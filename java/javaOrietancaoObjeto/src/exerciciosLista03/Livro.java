package exerciciosLista03;

import javax.swing.JOptionPane;

public class Livro  extends Biblioteca{

    public String nomeLivro;
    public Livro[] vetLivros;
    public String descricaoLivro;
    private boolean status;
    public float tempo;
    private int i = 0;

    public void nomeDoLivro() {
        nomeLivro = JOptionPane.showInputDialog("Digite o nome do Livro");
    }

    public void descricaoDoLivro() {
        descricaoLivro = JOptionPane.showInputDialog("Informe o gênero do livro");

    }

    public boolean livroEstaAlugado() {
        return true;
    }

    public void tempoParaFicarLivro() {
        tempo = Float.parseFloat(JOptionPane.showInputDialog("Informe o tempo que você ira ficar com o livro " + nomeLivro));
    }
    public void chamandoVetorLivros(){
        int x = 0;
        System.out.println("O livro " + this.vetLivros[x]);
    }
    
   public void infoLivro(){
       
   }

}
