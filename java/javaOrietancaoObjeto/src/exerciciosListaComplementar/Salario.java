package exerciciosListaComplementar;

import javax.swing.JOptionPane;

public class Salario {

    private String nome, sobrenome, geNomeSobrenome, funcionario;
    private String[] escolhaFuncionario = new String[2];
    private float salario, primeiraParcela, segundaParcela, salarioPrimeiraParcela, salarioSegundaParcela;
    private int matricula, x = 0;

    public void nomeSobrenome() {

        nome = JOptionPane.showInputDialog("Digite o nome ");
        sobrenome = JOptionPane.showInputDialog("Digite o sobrenome ");
        geNomeSobrenome = (nome + " " + sobrenome);
        
        System.out.println(geNomeSobrenome);

    }

    public void salario() {
        do {
            salario = Integer.parseInt(JOptionPane.
                    showInputDialog("Digite o salario do funcionário inteiro " + geNomeSobrenome));

            if (salario <= 0) {
                JOptionPane.showMessageDialog(null, "Não existe salario negativo!!! \n Digite novamente certo seu bocó");
            }

        } while (!(salario > 0));
        

    }

    /* public void escolhaProfissao() {

     funcionario = JOptionPane.showInputDialog("Digite se o funcionário for professor \n S: SIM \n N: NÃO");
     do {
     switch (funcionario) {
     case "s":
     case "S":
     escolhaFuncionario[0] = "professor";
     escolhaFuncionario[x] = escolhaFuncionario[0];
     break;
     case "n":
     case "N":
     escolhaFuncionario[1] = "não é professor";
     escolhaFuncionario[x] = escolhaFuncionario[1];
     break;
     default:
     JOptionPane.showMessageDialog(null, "Esta opção está errada \n Digite novamente");

     }
     } while (!(funcionario.equals("s")) && !(funcionario.equals("S"))
     && !(funcionario.equals("n")) && !(funcionario.equals("N")));
        

     }*/
    public void funcionario() {
        nomeSobrenome();
        salario();

        primeiraParcela = (salario * 60) / 100;
        salarioPrimeiraParcela = (salario - primeiraParcela);
        segundaParcela = (salario * 40) / 100;
        salarioSegundaParcela = (salario - segundaParcela);

        JOptionPane.showMessageDialog(null, "O funcionário " + geNomeSobrenome + " irá receber até o dia 15 60% do Salario que "
                + "corresponde há R$" + salarioPrimeiraParcela + " e irá receber do dia 16 até dia 30 40% "
                + "que corresponde há R$ " + salarioSegundaParcela);
        
        System.out.println("O funcionário " + geNomeSobrenome + " irá receber até o dia 15 60% do Salario que "
                + "corresponde há R$" + salarioPrimeiraParcela + " e irá receber do dia 16 até dia 30 40% "
                + "que corresponde há R$ " + salarioSegundaParcela);
    }

    public void professor() {
        nomeSobrenome();
        salario();
        JOptionPane.showMessageDialog(null, "O salario de Professor é inteiro então ele recebeu R$ " + salario);
         System.out.println("O salario de Professor é inteiro então ele recebeu R$ " + salario);

    }

    public void execucaoAlgo() {
            nomeSobrenome();
            funcionario();
            professor();

        
    }

    public static void main(String[] args) {
        Salario objSal = new Salario();
        objSal.execucaoAlgo();
        
       

    }

}
