package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe01 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horas = s.nextInt();
        System.out.print("Digite o valor por hora recebido:");
        double pagto = s.nextDouble();

        double salarioTotal = horas * pagto;
        if (horas > 160) {
            double salarioExtra = (horas - 160) * (pagto / 2); 
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println("O salário total do mês é: R$ " + d.format(salarioTotal));
        s.close();
    }
}