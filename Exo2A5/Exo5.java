package Exo2A5;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Entrez un nombre entre 1 et 3 : ");
            nombre = scanner.nextInt();
        } while (nombre < 1 || nombre > 3);

        System.out.println("Merci ! Vous avez entré : " + nombre);
        scanner.close();
    }
}
