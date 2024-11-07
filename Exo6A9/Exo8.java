package Exo6A9;

import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre de départ : ");
        int nombre = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + i);
        }

        scanner.close();
    }
}
