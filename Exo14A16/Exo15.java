package Exo14A16;

import java.util.Scanner;

public class Exo15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une suite de caractères (terminée par '*') : ");

        int compteurA = 0;
        char caractere;

        while (true) {
            caractere = scanner.next().charAt(0);
            if (caractere == '*') break;
            if (caractere == 'A' || caractere == 'a') {
                compteurA++;
            }
        }

        System.out.println("Le nombre d'apparitions de la lettre 'A' ou 'a' est : " + compteurA);
        scanner.close();
    }
}
