package fr.dampierre;

import java.util.Random;

public class C2_JeuDeLoie {
    public static void main(String[] args) {
        Random generateur = new Random();
        int progression = 0;
        int nbLancers = 5;
        int nbCases = 20; // Sans compter start

        int i = 0;
        while (i < nbLancers && progression < 20) {
            progression += generateur.nextInt(6) + 1;
            i++;
        }

        if (nbCases == progression) {
            System.out.println(
                    "Vous avez gagné ! Vous avez traversé les " + progression + " cases en " + i + " lancers.");
        } else {
            System.out.println("Vous avez perdu ! Vous avez traversé " + progression + " cases en " + i + " lancers.");
        }
    }
}
