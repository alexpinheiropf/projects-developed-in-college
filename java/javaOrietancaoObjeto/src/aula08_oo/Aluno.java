package aula08_oo;

public class Aluno {

    public static int totalAlunos;
    private String nome;
    private String sobreNome;
    private boolean matriculado;

    public Aluno(String n, String s, boolean m) {
        this.nome = n;
        this.sobreNome = s;
        this.matriculado = m;
    }

    public void imprimirDesc() {
        System.out.println("Aluno " + this.nome + " " + this.sobreNome + (!this.matriculado ? " não "
                : " ") + " está matriculado.");
    }

    public void imprimirTotalAlunos() {

        System.out.println("Total Alunos: "
                + Aluno.totalAlunos);
    }

    public void setAluno(String n) {
        // System.out.println("Parâmetro n = " + n);
        this.nome = n;
        //System.out.println("Parâmetro s = " + s);
        // this.sobreNome = s;
    }

    public void imprimirNome() {
        System.out.println("O nome do Aluno é: " + this.nome);
    }

    public void mediaAluno(float n1, float n2) {
        float media = (n1 + n2) / 2;
        System.out.println("A soma do nota 1 + nota 2 é: " + media);
    }

    public void mediaAluno(float n1, float n2, float n3, float n4) {
        float media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A soma da nota 1 +  nota 2 + nota 3 + nota 4 é: " + media);
    }
}
