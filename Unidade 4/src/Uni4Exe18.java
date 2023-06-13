package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe18 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.println("Qual o dia do vencimento?");
        int diaVencimento = s.nextInt();
        while (diaVencimento > 10) {
            System.out.println("Dia de vencimento Inválido!");
            System.out.println("Qual o dia do vencimento?");
            diaVencimento = s.nextInt();
        }
        System.out.println("Qual o dia que foi pago?");
        int diaPago = s.nextInt();
        System.out.println("Qual o valor da prestação?");
        double valorPrestacao = s.nextDouble();
            if (diaPago <= diaVencimento) {
                double valorComDesconto = valorPrestacao - (valorPrestacao * 0.10);
                System.out.println("O valor da prestação era de: " + d.format(valorPrestacao));
                System.out.println("E o valor da prestação com 10% de desconto ficou: " + d.format(valorComDesconto));
            } else if (diaPago <= (diaVencimento + 5)) { 
                System.out.println("O valor da prestação era de: " + d.format(valorPrestacao) + " e continuou igual pois não teve desconto.");
            } else {
                double diasMulta = (diaPago - diaVencimento); // caso não conte os 5 primeiros dias de vencimento, ficará assim --> double diasMulta = (diaPago - diaVencimento) - 5;  
                double valorComMulta = valorPrestacao + (valorPrestacao * ((diasMulta * 2) / 100)); 
                System.out.println("O valor da prestação era de: " + d.format(valorPrestacao));
                System.out.println("E o valor da prestação com " + diasMulta + " dias de multa ficou: " + d.format(valorComMulta));
            }
        
        s.close();
    }
}