package aula07_oo;

public class contador {

    private float valorCont;
    private float valContAnt;
    public float qtdIncremento;

    public void imprimirValContAtual() {
        System.out.println("O valor atual é: " + this.valorCont);
    }

    public void incrementoUnitario() {
        this.valContAnt = this.valorCont;
        this.valorCont++;
        this.imprimirValContAtual();

    }

    public void incrementarMais() {
        this.valContAnt = this.valorCont;
        this.valorCont = this.valorCont + this.qtdIncremento;
        this.imprimirValContAtual();
    }

    public void valorZerado() {
        valorCont = 0;
        System.out.println("A valor zerou ");

    }

    public void voltarValor(){
        float aux = this.valorCont;
        this.valorCont = this.valContAnt;
        this.valContAnt = aux;
        this.imprimirValContAtual();
    }
}
