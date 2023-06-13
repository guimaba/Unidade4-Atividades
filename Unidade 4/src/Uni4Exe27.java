package Exercícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe27 {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.println("Quando chegou? (Insira as horas e minutos com espaçamento entre eles)");
        int horasChegada = s.nextInt();        
        int miuntosChegada = s.nextInt();
        System.out.println("Quando saiu? (Insira as horas e minutos com espaçamento entre eles)");
        int horasSaida = s.nextInt();        
        int miuntosSaida = s.nextInt();
        int ficouHoras = horasSaida - horasChegada; 
        int ficouMinutos = miuntosSaida - miuntosChegada;
        if (ficouHoras > 5) {
                double horas = ficouHoras - 5;
                double valor = 35.00 + (horas * 10);
            if (ficouMinutos >= 30) {
                valor = valor + 10;
                System.out.println("Deverá pagar R$ " + d.format(valor));
            } else {
                System.out.println("Deverá pagar R$ " + d.format(valor));          
            }
        } else {
        switch (ficouHoras) {
            case 0:
            System.out.println("Deverá pagar R$ 5.00");            
            break;
            case 1:
            if (ficouMinutos < 30) {
                System.out.println("Deverá pagar R$ 5.00");
            } else {
                System.out.println("Deverá pagar R$ 10.00");                
            }
            break;
            case 2:
            if (ficouMinutos < 30) {
                System.out.println("Deverá pagar R$ 10.00");
            } else {
                System.out.println("Deverá pagar R$ 17.50");                
            }
            break;
            case 3:
            if (ficouMinutos < 30) {
                System.out.println("Deverá pagar R$ 17.50");
            } else {
                System.out.println("Deverá pagar R$ 25.00");                
            }
            break;
            case 4:
            if (ficouMinutos < 30) {
                System.out.println("Deverá pagar R$ 25.00");
            } else {
                System.out.println("Deverá pagar R$ 35.00");                
            }
            break;
            case 5:
            if (ficouMinutos < 30) {
                System.out.println("Deverá pagar R$ 35.00");
            } else {
                System.out.println("Deverá pagar R$ 45.00");                
            }
            break;
        }
    }
        s.close();
    }
}