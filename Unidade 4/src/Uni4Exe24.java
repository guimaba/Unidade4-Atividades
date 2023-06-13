package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe24 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args) {
        int valorMaior;
        int valorIntermediario;
        int valorMenor;
        System.out.print("Insira o valor 1: ");
        int valor1 = s.nextInt();
        valorMaior = valor1;
        System.out.print("Insira o valor 2: ");
        int valor2 = s.nextInt();
        if (valor2 > valorMaior) {
        valorMaior = valor2;
        valorIntermediario = valor1;
        } else {
        valorIntermediario = valor2;
        }
        System.out.print("Insira o valor 3: ");
        int valor3 = s.nextInt();
        if (valor3 > valorMaior) {
            valorMenor = valorIntermediario;
            valorIntermediario = valorMaior;
            valorMaior = valor3;
        } else if (valor3 > valorIntermediario && valor3 < valorMaior) {
            valorMenor = valorIntermediario;
            valorIntermediario = valor3;
        } else {
            valorMenor = 3;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Escolha uma das opções abaixo para apresentar os valores: ");
        System.out.println("1. Valores em ordem crescente; ");
        System.out.println("2. Valores em ordem decrescente; ");
        System.out.println("3. Maior valor ficar no meio");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        int opcao = s.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Ordem Crescente: ");
                System.out.println(valorMenor + ", " + valorIntermediario + ", " + valorMaior);
            break;
            case 2:
                System.out.println("Ordem Decrescente: ");
                System.out.println(valorMaior + ", " + valorIntermediario + ", " + valorMenor);
            break;
            case 3:
                System.out.println("Maior valor no meio: ");
                System.out.println(valorIntermediario + ", " + valorMaior + ", " + valorMenor);
            break;
        }
        s.close();
    }
}