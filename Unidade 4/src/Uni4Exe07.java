package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.println("Qual o peso da carta em gramas?");
        int peso = s.nextInt();
        double valorPagar = 0;
        if (peso > 50) {
            int pesoAdicional = peso - 50;
            pesoAdicional = (int) pesoAdicional / 20;
            int qtdAdicional = (int) (pesoAdicional + 1);
            double valorAdicional = (double) (qtdAdicional * 0.45);
            valorPagar = valorAdicional + 0.45;
        } 
        else
            valorPagar = 0.45;
        System.out.println("Custo do selo: R$ " + d.format(valorPagar));
        s.close();
    }
}