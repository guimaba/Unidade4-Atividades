package Exercícios;

import java.util.Scanner;

public class Uni4Exe03 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.print("Insira o primeiro valor: ");
            int valor1 = s.nextInt();
            System.out.print("Insira o segundo valor: ");
            int valor2 = s.nextInt();
            if (valor1 > valor2)
                System.out.println("O primeiro valor é maior: " + valor1 + " > " + valor2);
            else
                System.out.println("O segundo valor é maior: " + valor2 + " > " + valor1);
        s.close();
    }
}