package Exercícios;

import java.util.Scanner; 

public class Uni4Exe13 {
    static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
        int cartasBoas = 0;        
        System.out.print("Informe a primeira carta: ");
        int c1 = s.nextInt();
        if (c1 == 1 || c1 == 2 || c1 == 3) {
            cartasBoas++;
        }
        System.out.print("Informe a segunda carta: ");
        int c2 = s.nextInt();
        if (c2 == 1 || c2 == 2 || c2 == 3) {
            cartasBoas++;
        }
        System.out.print("Informe a primeira carta: ");
        int c3 = s.nextInt();
        if (c3 == 1 || c3 == 2 || c3 == 3) {
            cartasBoas++;
        }
        if (cartasBoas == 1) {
            System.out.println("TRUCO!");
        }
        else if (cartasBoas == 2) {
            System.out.println("SEIS!");
        }
        else if (cartasBoas == 3) {
            System.out.println("NOVE");
        }        
        s.close();
    }
}