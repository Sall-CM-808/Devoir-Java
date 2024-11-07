package Exo2A5;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de photocopies : ");
        int nbPhotocopies = scanner.nextInt();
        double montant = 0;

        if (nbPhotocopies <= 10) {
            montant = nbPhotocopies * 2;
        } else if (nbPhotocopies <= 30) {
            montant = 10 * 2 + (nbPhotocopies - 10) * 1.5;
        } else {
            montant = 10 * 2 + 20 * 1.5 + (nbPhotocopies - 30);
        }

        System.out.println("Le montant total est : " + montant + " F");
        scanner.close();
    }
}
