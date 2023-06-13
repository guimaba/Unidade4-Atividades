package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe20 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.0");
    public static void main(String[] args) {
        System.out.print("Insira a primeira nota: "); 
        double nota1 = s.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = s.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double nota3 = s.nextDouble();
        System.out.print("Insira a nota média dos exercícios: ");
        double notaEx = s.nextDouble();
        double media = (nota1+nota2*2+nota3*3+notaEx)/7;
        if (media >= 9.0) {
            System.out.println("A média é: " + d.format(media) + " | Conceito: A | Aluno Aprovado!");
        }
        if (media >= 7.5 && media < 9.0) {
            System.out.println("A média é: " + d.format(media) + " | Conceito: B | Aluno Aprovado!");
        }
        if (media >= 6.0 && media < 7.5) {
            System.out.println("A média é: " + d.format(media) + " | Conceito: C | Aluno Aprovado!");
        }
        if (media >= 4.0 && media < 6.0) {
            System.out.println("A média é: " + d.format(media) + " | Conceito: D | Aluno Reprovado.");
        }
        if (media < 4.0) {
            System.out.println("A média é: " + d.format(media) + " | Conceito: E | Aluno Reprovado.");
        }
        s.close();
    }
}