package fr.dampierre.TP04;

import java.text.DecimalFormat;
import java.util.Random;

public class TD4v9 {
    public static void main(String[] args) {
        final int maximum = 100;
        final int parties = 10000;

        Random random = new Random();

        int guess;
        int nombre;
        int tentatives;
        double moyenne = 0;

        int guessmin;
        int guessmax;

        for (int i = 0; i < parties; i++) {
            nombre = random.nextInt(maximum + 1);

            guess = -1;
            tentatives = 0;
            guessmin = 0 - 1;
            guessmax = maximum + 1;

            while (guess != nombre) {
                guess = (guessmax + guessmin) / 2;

                if (guess < nombre) {
                    guessmin = guess;
                } else if (guess > nombre) {
                    guessmax = guess;
                }
                tentatives++;
            }
            moyenne += tentatives;
        }

        moyenne = moyenne / parties;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(
                "\nEn moyenne, sur " + parties + " parties, il m'a fallu " + df.format(moyenne) + " tentatives.");
    }
}
