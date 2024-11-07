package Exo2A5;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le coefficient a : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le 12coefficient b : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez le coefficient c : ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Delta = "+ delta);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Les racines sont : x1 = " + x1 + " et x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("La racine double est : x = " + x);
        } else {
            System.out.println("Pas de racines réelles.");
        }
        scanner.close();
    }
}
