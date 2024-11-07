package Exo6A9;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre de départ : ");
        int nombre = scanner.nextInt();
        int compteur = 1;

        while (compteur <= 10) {
            nombre++;
            System.out.println(nombre);
            compteur++;
        }

        scanner.close();
    }
}
