package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe15 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.print("Informe a quanto tempo o funcionário trabalha: ");
        int meses = s.nextInt();
        System.out.print("Informe o salário do trabalhador: ");
        double salario = s.nextDouble();
        double percentoReaj = 0;
        if (meses < 13) {
            percentoReaj = 5/100;
        }
        else if (meses < 49 && meses > 12) {
            percentoReaj = 7/100;
        }
        else {
            System.out.println("A empresa não existe a mais de 48 meses.");
        }
        double valorReajuste = (salario * percentoReaj);
        double salarioCR = valorReajuste + salario;
            System.out.println("O valor total do salário com reajuste foi: R$ " + d.format(salarioCR));
            System.out.println("O valor do reajuste foi: R$ " + d.format(valorReajuste));
        s.close();
    }
}