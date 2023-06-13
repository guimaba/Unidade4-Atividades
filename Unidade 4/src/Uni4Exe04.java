package Exercícios;

import java.util.Scanner;

public class Uni4Exe04 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite um número no ponto flutuante maior que zero: ");
        float n = s.nextFloat();
        if (n - Math.floor(n) != 0.0)
			System.out.println("Tem casas decimais.");
		else
			System.out.println("Não tem casas decimais.");
        s.close();
    }
}