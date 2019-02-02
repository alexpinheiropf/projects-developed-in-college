
package exerciciosListaComplementar;


public class goblin {
    

    private int dano;
    private int vida;
    private String tipo;
    public goblin(String tip)
    {
        this.tipo = tip;
        int numero;
        if(tip.equals("goblin")){
            numero = (int) ((Math.random()*2) + 1);
            this.dano = numero;
            numero = (int) ((Math.random()*2) + 2);
            this.vida = numero;
        }else{
            if(tip.equals("orc")){
                numero = (int) ((Math.random()*3) + 2);
                this.dano = numero;
                numero = (int) ((Math.random()*3) + 3);
                this.vida = numero;
            }
            else{
                if(tip.equals("troll")){
                    numero = (int) ((Math.random()*3) + 4);
                    this.dano = numero;
                    numero = (int) ((Math.random()*4) + 4);
                    this.vida = numero;
                }
            }
        }
    }
    
    public static goblin Inimigo(){
       int numero = (int) (Math.random()*3);
       String n = "";
       switch (numero) {
           case 0:
               n = "goblin";
               break;
           case 1:
               n = "orc";
               break;
           case 2:
               n = "troll";
               break;
       }
       return new goblin(n);
    }
    
    public int getDano(){
        return dano;
    }

    public int getVida(){
        return vida;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void sofreDano(int val){
        vida -= val;
    }
    
    public boolean morto(){
        return (vida <= 0 ? true : false);
    }

}
    

