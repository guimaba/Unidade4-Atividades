package Exercícios;

import java.util.Scanner;

public class Uni4Exe06 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Informe o sexo: ");
       String sex = s.nextLine(); 
       sex.toUpperCase();
        if (sex.equals("M"))
            System.out.println("Masculino.");
        else if (sex.equals("F"))
            System.out.println("Feminino.");
        else if (sex.equals("I"))
            System.out.println("Não Informado.");
        else
            System.out.println("Entrada Incorreta.");
        s.close();
    }
}