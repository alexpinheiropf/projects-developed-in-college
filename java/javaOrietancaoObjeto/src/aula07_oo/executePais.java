package aula07_oo;

public class executePais {

    public static void main(String[] args) {
        pais p1 = new pais();
        pais p2 = new pais();
        pais p3 = new pais();
        
        p1.nome = "Brasil";
        p1.dimensao = 540f;
        p1.capital = "Rio Grande do Sul";
        
        p2.nome = "LOIU";
        p2.dimensao = 890f;
        p2.capital = "Guine";
        
        p3.nome = "Ruis";
        p3.dimensao = 679f;
        p3.capital = "Cap 03";
        
        p1.vetPais = new pais[2];
        p1.vetPais[0] = p2;
        p1.vetPais[1] = p3;
        
        p2.vetPais = new pais[1];
        p2.vetPais[0] = p1;
        
        p3.vetPais = new pais[1];
        p3.vetPais[0] = p1;
        
        
        
        //p1.info();
        //p1.paisesFronteira();
        
        p3.info();
        p3.paisesFronteira();
    }
    
}
