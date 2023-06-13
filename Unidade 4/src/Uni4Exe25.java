package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe25 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.0");
    public static void main(String[] args) {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = s.nextInt();
        while (opcao < 1 || opcao > 4) {
            System.out.println("Opção Inválida! ");
            System.out.print("Insira novamente: ");
            opcao = s.nextInt();
        }
            switch (opcao) {
                case 1:
                    System.out.println("Insira o primeiro número: ");
                    double num1 = s.nextDouble();
                    System.out.println("Insira o segundo número: ");
                    double num2 = s.nextDouble();
                    double resultado = num1 + num2;
                    System.out.println("O resultado da soma é: " + d.format(resultado));
                break;
                case 2:
                    System.out.println("Insira o primeiro número: ");
                    num1 = s.nextDouble();
                    System.out.println("Insira o segundo número: ");
                    num2 = s.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("O resultado da diferença é: " + d.format(resultado));
                break;
                case 3:
                    System.out.println("Insira o primeiro número: ");
                    num1 = s.nextDouble();
                    System.out.println("Insira o segundo número: ");
                    num2 = s.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("O resultado do produto é: " + d.format(resultado));
                break;
                case 4:
                    System.out.println("Insira o primeiro número: ");
                    num1 = s.nextDouble();
                    System.out.println("Insira o segundo número: ");
                    num2 = s.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + d.format(resultado));
                break;
        }
        s.close();
    }
}