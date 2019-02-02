package aula07_oo;

public class pais {

    public String nome;
    public String capital;
    public float dimensao;
    public pais[] vetPais;

    public void info() {
        System.out.println("O nome do pais é " + this.nome
                + " a sua capital é " + this.capital
                + " e a sua dimensão é " +  " km² \n\n ");
    }

    public void paisesFronteira() {
        System.out.println("Paises que fazem fronteira com " + this.nome);
        for(int x = 0; x < this.vetPais.length; x++){
            this.vetPais[x].info();
        }

    }

}
