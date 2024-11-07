package Exo10A13;

import java.util.Scanner;

public class Exo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour calculer sa factorielle : ");
        int nombre = scanner.nextInt();
        int factorielle = 1;

        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }

        System.out.println("La factorielle de " + nombre + " est : " + factorielle);
        scanner.close();
    }
}
