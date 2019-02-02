package exerciciosListaComplementar;

import javax.swing.JOptionPane;

public class IdadeMaior {

    private String nome1, nome2, nome3;
    private int idade1, idade2, idade3;

    public void info() {
        nome1 = JOptionPane.showInputDialog("Digite o nome da pessoa");
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

        nome2 = JOptionPane.showInputDialog("Digite o nome da pessoa");
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

        nome3 = JOptionPane.showInputDialog("Digite o nome da pessoa");
        idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

    }

    public void maisVelho() {

        if (idade1 > idade2 && idade1 > idade3) {
            JOptionPane.showMessageDialog(null, this.nome1 + " é a pessoa mais velha com " + idade1 + " anos");
        } else if (idade2 > idade1 && idade2 > idade3) {
            JOptionPane.showMessageDialog(null, this.nome2 + " é a pessoa mais velha com " + idade2 + " anos");
        } else if (idade3 > idade2 && idade3 > idade1) {
            JOptionPane.showMessageDialog(null, this.nome3 + " é a pessoa mais velha com " + idade3 + " anos");
        }
    }

    public void maisNovo() {
        if (idade1 < idade2 && idade1 < idade3) {
            JOptionPane.showMessageDialog(null, this.nome1 + " é a pessoa mais nova com " + idade1 + " anos");
        } else if (idade2 < idade1 && idade2 < idade3) {
            JOptionPane.showMessageDialog(null, this.nome2 + " é a pessoa mais nova com " + idade2 + " anos");
        } else if (idade3 < idade2 && idade3 < idade1) {
            JOptionPane.showMessageDialog(null, this.nome3 + " é a pessoa mais nova com " + idade3 + " anos");
        }
    }

    public void chamaTdo() {
        info();
        maisNovo();
        maisVelho();
    }

    public static void main(String[] args) {
        IdadeMaior objIdade = new IdadeMaior();
        objIdade.chamaTdo();
    }
}
