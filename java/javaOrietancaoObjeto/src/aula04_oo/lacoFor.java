package aula04_oo;

import javax.swing.JOptionPane;

public class lacoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        
        for(i = 0 ; i < 10 ;i ++){
            JOptionPane.showMessageDialog(null, i);
            System.out.println(i);
        }
        
    }
}
