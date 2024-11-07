package Exo14A16;

import java.util.Scanner;

public class Exo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sommeDue = 0;

        // Lire la suite des prix
        while (true) {
            System.out.print("Entrez le prix de l'achat (0 pour terminer) : ");
            int prix = scanner.nextInt();
            if (prix == 0) break;
            sommeDue += prix;
        }

        System.out.println("La somme due est : " + sommeDue + " F");
        System.out.print("Entrez la somme payée par le client : ");
        int sommePayee = scanner.nextInt();

        int monnaie = sommePayee - sommeDue;

        if (monnaie > 0) {
            System.out.println("Monnaie à rendre : " + monnaie + " F");
            int billets10 = monnaie / 10;
            monnaie %= 10;
            int billets5 = monnaie / 5;
            monnaie %= 5;
            int billets1 = monnaie;

            for (int i = 0; i < billets10; i++) System.out.println("10 F");
            for (int i = 0; i < billets5; i++) System.out.println("5 F");
            for (int i = 0; i < billets1; i++) System.out.println("1 F");
        } else if (monnaie == 0) {
            System.out.println("Aucune monnaie à rendre.");
        } else {
            System.out.println("Montant insuffisant. Il manque : " + (-monnaie) + " F");
        }

        scanner.close();
    }
}
