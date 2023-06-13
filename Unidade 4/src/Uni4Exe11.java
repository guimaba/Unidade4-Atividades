package Exercícios;

import java.util.Scanner; 

public class Uni4Exe11 {
    static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Digite a idade do primeiro irmão: ");
        int i1 = s.nextInt();
        System.out.print("Digite a idade do segundo irmão: ");
        int i2 = s.nextInt();
        System.out.print("Digite a idade do terceiro irmão: ");
        int i3 = s.nextInt();
        if ((i1 == i2 && i1 != i3) || (i2 == i3 && i2 != i1) || (i1 == i3 && i1 != i2)) {
            System.out.println("São gêmeos.");
        }
        else if (i1 == i2 && i1 == i3) {
            System.out.println("São trigêmeos.");
        }
        else {
            System.out.println("São apenas irmãos.");
        }
        s.close();
    }
}
