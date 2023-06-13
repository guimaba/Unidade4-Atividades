package Exercícios;

import java.util.Scanner; 

public class Uni4Exe12 {
    static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Escreva o cuoprimento do lado 1: ");
        int lado1 = s.nextInt();
        System.out.print("Escreva o cuoprimento do lado 1: ");
        int lado2 = s.nextInt();
        System.out.print("Escreva o cuoprimento do lado 1: ");
        int lado3 = s.nextInt();
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero.");
            }
                if ((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1) || (lado1 == lado3 && lado1 != lado2)) {
                System.out.println("Triângulo Isóceles.");
            }
            else {
                System.out.println("Triângulo Escaleno.");
            } 
        }
        else 
            System.out.println("Não formam um triângulo.");
        s.close();
    }
}