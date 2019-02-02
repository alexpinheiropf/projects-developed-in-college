package exerciciosListaComplementar;

import javax.swing.JOptionPane;

public class Habitantes {

    private String[] vetSexo = new String[2];
    private int idade, i = 0, maior = Integer.MIN_VALUE, cont = 0, somaCont = 0, qtdPessoas, percentual, x;
    private String[] corCabelo = new String[3];
    private String[] corDoOlho = new String[3];
    private String corOlho, sexo, corDeCabelo;

    public void qtdPessoas() {
        do {
            qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de habitantes"));

            if (qtdPessoas <= 0) {
                JOptionPane.showMessageDialog(null, "A quantidade não pode ser menor ou igual a zero \n Favor digite novamente");
            }

        } while ((qtdPessoas <= 0));
    }

    public void idade() {

        do {

            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + (i + 1) + "ª pessoa de " + qtdPessoas + " pessoas"));

            if (idade > 0 && idade < 90) {

            } else {
                JOptionPane.showMessageDialog(null, "Idade errada!!! \n Digite novamente");

            }
        } while (!(idade > 0) || !(idade <= 90));

        if (idade >= 18 && idade <= 35) {
            cont++;
        }
    }

    public void determinaSexo() {

        do {

            sexo = JOptionPane.showInputDialog("Digite o sexo da " + (i + 1) + "ª pessoa de " + qtdPessoas + " pessoas"
                    + " \n Opção: \n F - Feminino \n M - Masculino");

            switch (sexo) {
                case "M":
                case "m":
                    vetSexo[0] = "maculino";
                    vetSexo[x] = vetSexo[0];
                    break;
                case "F":
                case "f":
                    vetSexo[1] = "feminino";
                    vetSexo[x] = vetSexo[1];
                    cont++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sexo Inválido \n Digite novamente!");
            }
        } while (!(sexo.equals("M")) && !(sexo.equals("F")) && !(sexo.equals("m")) && !(sexo.equals("f")));
    }

    public void corDeCabelo() {

        do {

            corDeCabelo = JOptionPane.showInputDialog("Digite a cor do cabelo da " + (i + 1) + "ª pessoa de " + qtdPessoas + " pessoas"
                    + " \n Opção: \n L - Loiro \n C - Castanho \n P - Preto");

            switch (corDeCabelo) {
                case "L":
                case "l":
                    corCabelo[0] = "loiro";
                    corCabelo[x] = corCabelo[0];
                    cont++;
                    break;
                case "C":
                case "c":
                    corCabelo[1] = "Castanho";
                    corCabelo[x] = corCabelo[1];
                    break;
                case "P":
                case "p":
                    corCabelo[2] = "Preto";
                    corCabelo[x] = corCabelo[2];
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Não existe esse cabelo \n Digite novamente!");
            }
        } while (!(corDeCabelo.equals("L")) && !(corDeCabelo.equals("l")) && !(corDeCabelo.equals("C"))
                && !(corDeCabelo.equals("c")) && !(corDeCabelo.equals("P")) && !(corDeCabelo.equals("p")));
    }

    public void corDoOlho() {

        do {

            corOlho = JOptionPane.showInputDialog("Digite a cor do olho da " + (i + 1) + "ª pessoa de " + qtdPessoas + " pessoas"
                    + " * A para Azul \n * C para Castanho: \n * V para verde:");

            switch (corOlho) {
                case "A":
                case "a":
                    corDoOlho[0] = "olhos azuis";
                    corDoOlho[x] = corDoOlho[0];
                    break;
                case "C":
                case "c":
                    corDoOlho[1] = "olhos castanhos";
                    corDoOlho[x] = corDoOlho[1];
                    break;
                case "V":
                case "v":
                    corDoOlho[2] = "olhos verdes";
                    corDoOlho[x] = corDoOlho[2];
                    cont++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Não existe esse cabelo \n Digite novamente!");
            }
        } while (!(corOlho.equals("A")) && !(corOlho.equals("a")) && !(corOlho.equals("C"))
                && !(corOlho.equals("c")) && !(corOlho.equals("V")) && !(corOlho.equals("v")));
    }

    public void pessoas() {

        System.out.println("A " + (i + 1) + "ª pessoa do sexo " + vetSexo[x] + " de " + idade + " anos " + " tem o cabelo"
                + " de cor " + corCabelo[x] + " e olhos de cor " + corDoOlho[x]);

    }

    public void resolucaoAlgo() {
        qtdPessoas();
        for (; i < qtdPessoas; i++) {
            idade();
            determinaSexo();
            corDeCabelo();
            corDoOlho();
            pessoas();
            

            if (idade > maior) {
                maior = idade;
            }

            somaCont = (cont / 4);
            if (idade >= 18 && idade <= 35 && sexo.equals("f")
                    || sexo.equals("F") && corDeCabelo.equals("l")
                    || corDeCabelo.equals("L") && corOlho.equals("v")
                    || corOlho.equals("V")) {
                somaCont = (cont / 4);
                percentual = (somaCont * 100) / qtdPessoas;

            }
        }
        JOptionPane.showMessageDialog(null, "A idade maior é: " + maior + " anos \n O percentual de mulheres Loiras de"
                + " 18 a 35 anos "
                + "de olhos verdes são: " + percentual + " %");

    }
   

    public static void main(String[] args) {
        Habitantes objHab = new Habitantes();
        
        objHab.resolucaoAlgo();
        
    }

}
