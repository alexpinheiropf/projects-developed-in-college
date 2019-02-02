package aula09_oo;

import javax.swing.JOptionPane;

public class MainSala {

    public static void main(String[] args) {
        Sala s1 = new Sala("Esta é a Sala 1!");
        Sala s2 = new Sala("Esta é a Sala 1!");
        Sala s3 = new Sala("Esta é a Sala 1!");
        Sala s4 = new Sala("Esta é a Sala 1!");
        Sala s5 = new Sala("Esta é a Sala 1!");
        Sala s6 = new Sala("Esta é a Sala 6!");
        Sala s7 = new Sala("Esta é a Sala 7!");
        Sala s8 = new Sala("Esta é a Sala 8!");

        s1.salaOeste = s2;

        s2.salaLeste = s1;
        s2.salaNorte = s3;

        s3.salaSul = s2;
        s3.salaNorte = s5;

        s4.salaLeste = s5;

        s5.salaSul = s3;
        s5.salaOeste = s4;
        s5.salaLeste = s6;

        s6.salaOeste = s5;
        s6.salaNorte = s7;

        s7.salaSul = s6;
        s7.salaLeste = s8;

        s8.salaOeste = s7;

        Sala salaAtual = s2;
        String opcao, salasDisponiveis = "";

        while (true) {
            System.out.println(salaAtual.descricao);
            salasDisponiveis = null;
            if (salaAtual.salaNorte != null) {
                salasDisponiveis += "\nExiste sala ao (N)orte";
            }
            if (salaAtual.salaSul != null) {
                salasDisponiveis += "\nExiste sala ao (S)ul";
            }
            if (salaAtual.salaLeste != null) {
                salasDisponiveis += "\nExiste sala ao (L)este";
            }
            if (salaAtual.salaOeste != null) {
                salasDisponiveis += "\nExiste sala ao (O)este";
            }
            opcao = JOptionPane.showInputDialog("Digite uma opção: " + salasDisponiveis + "\n (E)xit");
            
            opcao = opcao.toLowerCase();
            if (opcao.equals("e")) {
                break;
            }else if(opcao.equals("n")){
                if(salaAtual.salaNorte != null){
                    salaAtual = salaAtual.salaNorte;
                }else{
                    JOptionPane.showMessageDialog(null, "Não Existe sala ao norte!");
                }
            }
        }
    }

}
