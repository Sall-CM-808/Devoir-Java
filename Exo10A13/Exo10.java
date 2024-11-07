package Exo10A13;

import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre de départ : ");
        int nombre = scanner.nextInt();
        int somme = 0;

        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }

        System.out.println("La somme des entiers jusqu'à " + nombre + " est : " + somme);
        scanner.close();
    }
}
