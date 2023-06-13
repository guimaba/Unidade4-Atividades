package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe26 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.0");
    public static void main(String[] args) {
        System.out.println("Escolha uma opção: ");
        System.out.println("T - Calcular área de um triângulo de base b e altura h.");
        System.out.println("Q - Calcular área de um quadrado de lado l.");
        System.out.println("R - Calcular área de um retângulo de base b e altura h.");
        System.out.println("C - Calcualr área de um círculo de raio r.");
        int opcao = s.nextInt();
        while (opcao < 1 || opcao > 4) {
            System.out.println("Opção Inválida! ");
            System.out.print("Insira novamente: ");
            opcao = s.nextInt();
        }
            switch (opcao) {
                case 'T':
                    System.out.println("Insira a base do Triângulo: ");
                    double baseT = s.nextDouble();
                    System.out.println("Insira a altura do Triângulo: ");
                    double alturaT = s.nextDouble();
                    double resultadoT = (baseT * alturaT) / 2;
                    System.out.println("O resultado da soma é: " + d.format(resultadoT));
                break;
                case 'Q':
                    System.out.println("Insira o lado do quadrado: ");
                    double ladoQ = s.nextDouble();
                    double resultadoQ = Math.pow(ladoQ, 2);
                    System.out.println("O resultado da diferença é: " + d.format(resultadoQ));
                break;
                case 'R':
                    System.out.println("Insira a base do Retângulo: ");
                    double baseR = s.nextDouble();
                    System.out.println("Insira a altura do Retângulo: ");
                    double alturaR = s.nextDouble();
                    double resultadoR = baseR * alturaR;
                    System.out.println("O resultado do produto é: " + d.format(resultadoR));
                break;
                case 'C':
                    System.out.println("Insira o raio do Circulo: ");
                    double raioC = s.nextDouble();
                    double resultadoC = Math.PI * Math.pow(raioC, 2);
                    System.out.println("O resultado da divisão é: " + d.format(resultadoC));
                break;
        }
        s.close();
    }
}