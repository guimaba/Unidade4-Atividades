package Exercícios;

import java.util.Scanner;

public class Uni4Exe19 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o vlor de X: ");
        float X = s.nextFloat();
        System.out.print("Digite o vlor de Y: ");
        float Y = s.nextFloat();
        if (X == 0 && Y == 0) {
            System.out.println("0");
        }
        else if (X > 0 && Y > 0) {
            System.out.println("1");
        }
        else if (X < 0 && Y > 0) {
            System.out.println("2");
        }
        else if (X < 0 && Y < 0) {
            System.out.println("3");
        }
        else if (X > 0 && Y < 0) {
            System.out.println("4");
        }
    }
}