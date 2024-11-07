package Exo6A9;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Entrez un nombre entre 10 et 20 : ");
            nombre = scanner.nextInt();

            if (nombre < 10) {
                System.out.println("Plus grand !");
            } else if (nombre > 20) {
                System.out.println("Plus petit !");
            }
        } while (nombre < 10 || nombre > 20);

        System.out.println("Merci ! Le nombre " + nombre + " est bien compris entre 10 et 20.");
        scanner.close();
    }
}
