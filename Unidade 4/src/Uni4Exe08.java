package Exercícios;

import java.util.Scanner;

public class Uni4Exe08 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma letra: ");
        String letra = s.nextLine();
        if (letra.trim().equalsIgnoreCase("a") || 
            letra.trim().equalsIgnoreCase("e") || 
            letra.trim().equalsIgnoreCase("i") || 
            letra.trim().equalsIgnoreCase("o") || 
            letra.trim().equalsIgnoreCase("u"))
            System.out.println("É vogal");
        else 
            System.out.println("NÃO é vogal");        
        s.close();
    }
}