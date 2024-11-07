package Exo10A13;

import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int position = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Entrez le nombre " + i + " : ");
            int nombre = scanner.nextInt();
            if (nombre > max) {
                max = nombre;
                position = i;
            }
        }

        System.out.println("Le plus grand nombre est : " + max);
        System.out.println("Il a été saisi à la position : " + position);
        scanner.close();
    }
}
