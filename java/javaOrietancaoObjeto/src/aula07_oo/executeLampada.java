package aula07_oo;

public class executeLampada {

    public static void main(String[] args) {
        lampada lamp01 = new lampada();
        lamp01.tipo = "Fluorecente";
        lamp01.voltagem = 220f;
        lamp01.info();
        
        lamp01.ligado_Desligado();
        lamp01.ligado_Desligado();
        lamp01.ligado_Desligado();
        lamp01.queimar();
        lamp01.ligado_Desligado();
        
        
        
        
    }

}
