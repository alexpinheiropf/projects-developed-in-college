package aula06_oo;

import javax.swing.JOptionPane;

public class Livro {

    private String titulo;
    private boolean aberto;
    private int qtd_pags;
    private int pag_atual;

    public void Iniciar_Livro(String titulo, int qtd_pags) {
        this.titulo = titulo;
        this.aberto = false;
        this.qtd_pags = qtd_pags;
        this.pag_atual = 0;

    }

    public String Retorna_Titulo() {

        return this.titulo;
    }

    public void Abrir_Fechar() {

    }

    public void Avancar_Pag() {
        if (this.pag_atual < this.qtd_pags) {
            this.pag_atual++;
        } else {
            System.out.println("Acabou as paginas");
        }
    }

    public void Voltar_Pag() {
        this.pag_atual--;
    }

    public void Ir_Pag(int num_pag_dest) {
        if (num_pag_dest > 0 && num_pag_dest <= this.qtd_pags) {
            this.pag_atual = num_pag_dest;
        } else {
            System.out.println("Você ja esta na primeira pagina!!!");
        }

    }
}
