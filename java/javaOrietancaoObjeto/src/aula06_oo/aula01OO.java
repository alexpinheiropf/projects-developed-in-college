package aula06_oo;
 
public class aula01OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro objLivro1 = new Livro();
        objLivro1.Iniciar_Livro("50 tons de laço",2000);
        System.out.println("Titulo do Livro " + objLivro1.Retorna_Titulo());
        objLivro1.Avancar_Pag();
        objLivro1.Avancar_Pag();
        objLivro1.Voltar_Pag();
        objLivro1.Voltar_Pag();
        objLivro1.Ir_Pag(252);
        objLivro1.Avancar_Pag();
        objLivro1.Ir_Pag(4000);
                
        
    }
    
}
