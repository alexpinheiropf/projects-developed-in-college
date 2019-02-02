package aula07_oo;

public class lampada {

    public String tipo;
    public float voltagem;
    private boolean acesa;
    private boolean queimado;

    public void ligado_Desligado() {
        if (this.queimado == false) {
            if (!(this.acesa)) {
                this.acesa = true;
                System.out.println("Lâmpada está acesa!!!");
            } else {
                this.acesa = false;
                System.out.println("Lâmpada está apagada!!!");
            }// outra alternativo this.acesa = !this.acesa;
        } else {
            System.out.println("Lâmpada está queimada!!!");
        }

    }

    public boolean retorneEstaAcessa() {
        return this.acesa;
    }

    public boolean retorneEstaQueimada() {
        return this.queimado;
    }

    public void info() {
        System.out.println("O tipo dessa lampada " + this.tipo
                + " a voltagem é: " + this.voltagem);
    }

    public void queimar() {
        this.queimado = true;
        this.acesa = false;
    }
}
