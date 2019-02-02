package com.loiane.cursojava.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class teste {

	public static void main(String[] args) {
		NumberFormat formatarFloat = new DecimalFormat("#.##");  
		  
        float numero1 = (float) 15.57564564;  
        float numero2 = (float) 12.25456465;  
  
        float novoNumero1 = Float.parseFloat(formatarFloat.format(numero1).replace(",", "."));//não sei se tem um jeito de fazer com que o format vir com . ao invez de ,  
        float novoNumero2 = Float.parseFloat(formatarFloat.format(numero2).replace(",", "."));//então faço um replace pra substituir a virgula por ponto  
  
        System.out.println(novoNumero1);  
        System.out.println(novoNumero2);

	}

}
