package Exercícios;

import java.util.Scanner;

public class Uni4Exe16 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite a idade do primeiro homem: ");
        int h1 = s.nextInt();
        System.out.println("Digite a idade do segundo homem: ");
        int h2 = s.nextInt();
        System.out.println("Digite a idade da primeira mulher: ");
        int m1 = s.nextInt();
        System.out.println("Digite a idade da segunda mulher: ");
        int m2 = s.nextInt();
        int SOMA = 0;
        int PRODUTO = 0;
        if (h1 > h2) {
            if (m1 > m2) {
                SOMA = h1 + m2;
                PRODUTO = h2 * m1;
            } else {
                SOMA = h2 + m1;
                PRODUTO = h1 * m2;
            }
        } else if (h2 > h1) {
            if (m1 > m2) {
                SOMA = h2 + m1;
                PRODUTO = h1 * m2;
            } else {
                SOMA = h1 + m2;
                PRODUTO = h2 * m1;
            }
        }
        System.out.println("A soma do homem mais velho e a mulher mais nova é: " + SOMA);
        System.out.println("O produto do homem mais novo e a mulher mais velha é: " + PRODUTO);
        s.close();
    }
}