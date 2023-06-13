package Exercícios;

import java.util.Scanner;

public class Uni4Exe23 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite um número positivo equivalente a um mês do ano: ");
        int mes = s.nextInt();
        while (mes > 12 || mes < 1) {
            System.out.println("Dado inserido não é válido!");
            System.out.print("Digite novamente: ");
            mes = s.nextInt();
        }
            if (mes == 1) {
                System.out.println("Janeiro");
            } else if (mes == 2) {
                System.out.println("Fevereiro");
            } else if (mes == 3) {
                System.out.println("Março");
            } else if (mes == 4) {
                System.out.println("Abril");
            } else if (mes == 5) {
                System.out.println("Maio");
            } else if (mes == 6) {
                System.out.println("Junho");
            } else if (mes == 7) {
                System.out.println("Julho");
            } else if (mes == 8) {
                System.out.println("Agosto");
            } else if (mes == 9) {
                System.out.println("Setembro");
            } else if (mes == 10) {
                System.out.println("Outubro");
            } else if (mes == 11) {
                System.out.println("Novembro");
            } else if (mes == 12) {
                System.out.println("Dezembro");
            } 
            }
    }