package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class TP01_5deveinombre {
    public static void main(String[] args) {
        final int maximum = 100;

        Random random = new Random();
        int nombre = random.nextInt(maximum + 1);

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int guess = Integer.parseInt(scan.next());
        scan.close();

        System.out.println("Vous proposez : " + guess);
        System.out.println("Le nombre auquel je pensais était : " + nombre);
        System.out.println("Vous étiez à " + Math.abs(nombre - guess) + " de la bonne réponse.");
    }
}
