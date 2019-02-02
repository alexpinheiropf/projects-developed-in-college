package exerciciosLista03;

import javax.swing.JOptionPane;

public class Biblioteca {

    public static void main(String[] args) {

        Livro objlLivro01 = new Livro();
        Livro objlLivro02 = new Livro();
        Livro objlLivro03 = new Livro();
        Livro objlLivro04 = new Livro();

        objlLivro01.nomeLivro = "50 Latons de Polar";
        objlLivro01.descricaoLivro = "Cervejaria";
        objlLivro01.tempo = 3f;

        objlLivro02.nomeLivro = "A volta dos que nao foram";
        objlLivro02.descricaoLivro = "Viagem";
        objlLivro02.tempo = 10f;

        objlLivro03.nomeLivro = "Dois Carecas brigando pelo pente";
        objlLivro03.descricaoLivro = "Luta";
        objlLivro03.tempo = 2f;

        objlLivro04.nomeLivro = "Foda-se";
        objlLivro04.descricaoLivro = "Sexo";
        objlLivro04.tempo = 8f;

        Livro objlLivro = new Livro();
        objlLivro.vetLivros = new Livro[4];
        objlLivro.vetLivros[0] = objlLivro01;
        objlLivro.vetLivros[1] = objlLivro02;
        objlLivro.vetLivros[2] = objlLivro03;
        objlLivro.vetLivros[3] = objlLivro04;

        Cliente objCliente = new Cliente();
        
        

    }

}
