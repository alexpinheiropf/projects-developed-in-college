package aula04_oo;

import static java.lang.System.in;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo;
        do {
            System.out.println("Informe o sexo dos indivíduos avaliados (M/F): ");
            sexo = scan.nextLine();

            switch (sexo) {
                case "M":
                case "m":
                    System.out.println("O sexo é Masculino");
                    break;
                case "F":
                case "f":
                    System.out.println("O sexo é Feminino");
                    break;
                default:
                    System.out.println("Sexo inválido!!!!");
                    sexo = in.toString();

            }
        } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));
    }
}
