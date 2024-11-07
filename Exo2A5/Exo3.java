package Exo2A5;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le numéro du jour (1-7) : ");
        int numeroJour = scanner.nextInt();

        String jour;
        switch (numeroJour) {
            case 1: jour = "Lundi"; break;
            case 2: jour = "Mardi"; break;
            case 3: jour = "Mercredi"; break;
            case 4: jour = "Jeudi"; break;
            case 5: jour = "Vendredi"; break;
            case 6: jour = "Samedi"; break;
            case 7: jour = "Dimanche"; break;
            default: jour = "Numéro de jour invalide"; break;
        }

        System.out.println("Le jour est : " + jour);
        scanner.close();
    }
}
