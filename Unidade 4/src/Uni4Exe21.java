package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe21 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.0");
    public static void main(String[] args) {
        System.out.print("Informe a Massa do Indivíduo (em kg): ");
        double peso = s.nextDouble();
        System.out.print("Informe a Altura do Indivíduo (em cm): ");
        double altura = s.nextDouble();
        altura = altura/100;   
        double imc = peso/Math.pow(altura, 2);
        if (imc < 18.5) {
        System.out.println("IMC: " + d.format(imc) + " | Magraza.");
        }
        if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("IMC: " + d.format(imc) + " | Saudável.");
        }
        if (imc >= 25.0 && imc <= 29.9) {
        System.out.println("IMC: " + d.format(imc) + " | Sobrepeso.");
        }
        if (imc >= 30.0 && imc <= 34.9) {
        System.out.println("IMC: " + d.format(imc) + " | Obesidade Grau I.");
        }
        if (imc >= 35.0 && imc <= 39.9) {
        System.out.println("IMC: " + d.format(imc) + " | Obesidade Grau II (severa).");
        }
        if (imc >= 40.0) {
        System.out.println("IMC: " + d.format(imc) + " | Obesidade Grau III (mórbida).");
        }
        s.close();
    }
}