package fr.dampierre.TP04;

import java.util.Random;
import java.util.Scanner;

public class TD4v5 {
    public static void main(String[] args) {
        final int maximum = 100;

        Random random = new Random();

        System.out.println("Je pense à un nombre entre 1 et " + maximum + " inclus. Devinez lequel.");

        Scanner scan = new Scanner(System.in);
        int guess;
        int nombre;
        int tentatives;
        String replay = "o";

        while (replay.equalsIgnoreCase("o")) {
            nombre = random.nextInt(maximum + 1);
            guess = -1;
            tentatives = 0;
            while (guess != nombre) {
                System.out.print("Entrez un nombre : ");
                guess = scan.nextInt();

                if (guess < 0 || guess > maximum) {
                    System.out.println("Merci d'entrer un nombre entre 1 et " + maximum + ".");
                } else {
                    if (guess < nombre) {
                        System.out.println("Trop petit.");
                    } else if (guess > nombre) {
                        System.out.println("Trop grand.");
                    } else {
                        System.out.println("Gagné !");
                    }
                    tentatives++;
                }
            }
            System.out.println("Il vous a fallu " + tentatives + " tentatives.");

            System.out.print("On continue (O/N) ? ");
            replay = scan.next();
        }
        scan.close();
        System.out.println("Merci d'avoir joué !");
    }
}
