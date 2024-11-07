package Exo14A16;

import java.util.Scanner;

public class Exo16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre binaire : ");
        String binaire = scanner.nextLine();

        int decimal = 0;
        int puissance = 1;

        for (int i = binaire.length() - 1; i >= 0; i--) {
            if (binaire.charAt(i) == '1') {
                decimal += puissance;
            }
            puissance *= 2;
        }

        System.out.println("La valeur décimale est : " + decimal);
        scanner.close();
    }
}
