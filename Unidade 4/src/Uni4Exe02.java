package Exercícios;

import java.util.Scanner;

public class Uni4Exe02 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Insira um valor maior que zero:");
        int valor = s.nextInt();
        if (valor % 2 == 0)
            System.out.println("É par.");
        else 
            System.out.println("É impar.");
        s.close();
    }
}