package Exercícios;

import java.util.Scanner;

public class Uni4Exe05 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("A cor é azul? (Sim/Não)");
        String azul = s.nextLine();
        if (azul.equals("Sim"))
            System.out.println("Sim.");
        else
            System.out.println("Não.");
        

        s.close();
    }
}