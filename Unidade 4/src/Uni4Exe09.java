package Exercícios;

import java.util.Scanner; 

public class Uni4Exe09 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o valor 1: ");
        int v1 = s.nextInt();
        System.out.print("Digite o valor 2: ");
        int v2 = s.nextInt();
        if (v1 % v2 == 0)
            System.out.println("É multiplo.");
        else
            System.out.println("Não é multiplo.");
        s.close();
    }
}