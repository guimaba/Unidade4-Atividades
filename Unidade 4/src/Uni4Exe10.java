package Exercícios;

import java.util.Scanner; 
public class Uni4Exe10 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Qual a idade de Marquinhos?");
        int M = s.nextInt();
        String cacula = "Marquinhos";
        System.out.println("Qual a idade de Zezinho?");
        int Z = s.nextInt();
        if (Z < M) 
            cacula = "Zezinho";
        System.out.println("Qual a idade de Luluzinha?");
        int L = s.nextInt();
        if (L < M && L < Z)
            cacula = "Luluzinha";

            System.out.println("O caçula é: " +  cacula);
        s.close();
    }
}