package fr.dampierre;

import java.util.Random;

public class C2_JeuDeLoie {
    public static void main(String[] args) {
        Random generateur = new Random();
        int nbLancers = 5;
        int nbCases = 20; // Sans compter start

        int progression = 0;
        boolean victoire = false;
        int parties = 0;

        int i = 0;
        int aleatoire;

        while (!victoire) {
            i = 0;
            progression = 0;

            parties++;

            while (i < nbLancers && progression < 20) {
                aleatoire = generateur.nextInt(6) + 1;
                progression += aleatoire;
                i++;
                System.out.println("Vous avez roulé un " + aleatoire);
                System.out.println("Vous êtes à la case " + progression);
            }

            victoire = nbCases == progression;
            if (!victoire) {
                System.out.println(
                        "Vous avez perdu ! Vous avez traversé " + progression + " cases en " + i + " lancers.");
            }
        }

        System.out.println("Vous avez gagné ! Vous avez traversé les " + progression + " cases en " + i
                + " lancers et en " + parties + " parties !");
    }
}
