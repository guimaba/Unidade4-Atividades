package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe17 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args) {
       // Renda Anual
       // N. Dependentes
       // Renda Líquida = Renda Anual - 2%*N.Dependentes
       // Até 2000 -> 0
       // Até 2000 - 5000 -> 5% * Renda Liquida
       // Até 5000 - 10000 -> 10% * Renda Líquida
       // de 10000+ -> 15% * Renda Líquida
        System.out.println("Qual a renda anual?");
        double rendaAnual = s.nextDouble(); 
        System.out.println("Qual o número de dependentes?");
        int dependentes = s.nextInt();
        double rendaLiquida = rendaAnual - (rendaAnual*(2/100*dependentes));
        if (rendaLiquida < 2000) {
            System.out.println("Não tem imposto.");
        }
        else if (rendaLiquida >= 2000 && rendaLiquida < 5000) {
            double imposto = rendaLiquida * 0.05;
            System.out.println("Imposto é: R$ " + d.format(imposto));
        }
        else if (rendaLiquida >= 5000 && rendaLiquida < 10000) {
            double imposto = rendaLiquida * 0.1;
            System.out.println("Imposto é: R$ " + d.format(imposto));
        }
        else if (rendaLiquida > 10000) {
            double imposto = rendaLiquida * 0.15;
            System.out.println("Imposto é: R$ " + d.format(imposto));
        }
        
        s.close();
    }
}