package Exo17;

import java.util.Scanner;

public class Exo17 {
    //methode pour calculer les N premier nombre
    public static int somme(int n) {
        return n * (n + 1) / 2;
    }
    //methode pour quotient
    public static void division(int a, int b) {
        int quotient = 0;
        int reste = a;

        while (reste >= b) {
            reste -= b;
            quotient++;
        }

        System.out.println("Quotient : " + quotient + ", Reste : " + reste);
    }
    //methode pour produit
    public static int produit(int a, int b) {
        int produit = 0;
        for (int i = 0; i < b; i++) {
            produit += a;
        }
        return produit;
    }
    // estDivisible
    public static boolean estDivisible(int a, int b) {
        return a % b == 0;
    }

    //les diviseurs d'un entier
    public static void afficherDiviseurs(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }

    // est-il premier
    public static boolean estPremier(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    //somme des chiffres
        public static int sommeChiffres(int n) {
            int somme = 0;
            while (n != 0) {
                somme += n % 10;
                n /= 10;
            }
            return somme;
        }

    public static void main(String[] args) {
        System.out.println("********** Somme des 10 premier nombre ****************");
        System.out.print("Donner un nombre : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Somme des 10 premiers nombres : " + somme(x));
        System.out.println("************ Minimun et Maximun ****************");
//
        System.out.print("Combien de nombres ? : ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Nombre invalide");
            return;
        }

        System.out.print("Entrez le premier nombre : ");
        int min = scanner.nextInt();
        int max = min;

        for (int i = 1; i < n; i++) {
            System.out.print("Entrez un nombre : ");
            int num = scanner.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Le minimum est : " + min);
        System.out.println("Le maximum est : " + max);
//Quotient
        System.out.println("------------- Quotient ---------------");
        division(10, 2);
//Produit de deux entiers avec +
        System.out.println("---------------- Produit de deux entiers avec + ----------");
        System.out.println("Produit : " + produit(4, 3));
// si a est divisible par b
        System.out.println("---------------- a est divisible par b ? ----------");
        System.out.println("Est divisible : " + estDivisible(10, 2));
// diviseurs d'un entier
        System.out.println("---------------- diviseurs d'un entier  ----------");
        afficherDiviseurs(12);
        System.out.println("---------------- est-il premier  ----------");
        System.out.println("Est premier ? : "+ estPremier(7));
// somme des chiffres
        System.out.println("---------------- Somme des chiffres  ----------");
        System.out.println("Somme des chiffres : " + sommeChiffres(123));

        scanner.close();
    }

}
