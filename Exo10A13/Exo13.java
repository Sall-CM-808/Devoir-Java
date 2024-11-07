package Exo10A13;

import java.util.Scanner;

public class Exo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int position = 0;
        int compteur = 0;

        while (true) {
            System.out.print("Entrez un nombre (0 pour terminer) : ");
            int nombre = scanner.nextInt();
            if (nombre == 0) break;

            compteur++;
            if (nombre > max) {
                max = nombre;
                position = compteur;
            }
        }

        if (compteur > 0) {
            System.out.println("Le plus grand nombre est : " + max);
            System.out.println("Il a été saisi à la position : " + position);
        } else {
            System.out.println("Aucun nombre n'a été saisi.");
        }
        scanner.close();
    }
}
