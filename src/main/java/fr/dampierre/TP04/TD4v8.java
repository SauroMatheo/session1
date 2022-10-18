package fr.dampierre.TP04;

import java.text.DecimalFormat;
import java.util.Random;

public class TD4v8 {
    public static void main(String[] args) {
        final int maximum = 100;
        final int essais = 10000;

        Random random = new Random();

        int guess;
        int nombre;
        int tentatives;
        double moyenne = 0;

        for (int i = 0; i < essais; i++) {
            System.out.print(i + " - ");

            nombre = random.nextInt(maximum + 1);
            guess = -1;
            tentatives = 0;
            while (guess != nombre) {
                guess = random.nextInt(maximum + 1);
                System.out.print(guess + " ");

                tentatives++;
            }
            System.out.println("[" + tentatives + "]");
            moyenne += tentatives;
        }

        moyenne = moyenne / essais;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(
                "\nEn moyenne, sur " + essais + " parties, il m'a fallu " + df.format(moyenne) + " tentatives.");
    }
}
