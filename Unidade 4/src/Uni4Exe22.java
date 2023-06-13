package Exercícios;

import java.util.Scanner;

public class Uni4Exe22 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("1. Ciência da Computação; ");
        System.out.println("2. Licenciatura da Computação; ");
        System.out.println("3. Sistemas de Informação. ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Qual opção (em números): ");
        int opcao = s.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("A Titulação recebida será: 'Bacharel em Ciência da Computação'");
                break;
            case 2:
                System.out.println("A Titulação recebida será: 'Licenciado em Computação'");
                break;
            case 3:
                System.out.println("A Titulação recebida será: 'Bacharel em Sistemas de Informação'");
                break;
        }
        s.close();
    }
}